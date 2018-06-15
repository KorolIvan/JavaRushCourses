package Java_Collections.level_6.lesson_10.task_5;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan Korol on 6/15/2018
 */
public class Solution {
    private List<Class> hiddenClasses = new ArrayList<>();
    private String packageName;

    public Solution(String packageName) {
        this.packageName = packageName;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Solution solution = new Solution(Solution.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "com/javarush/task/task36/task3606/data/second");
        solution.scanFileSystem();
        System.out.println(solution.getHiddenClassObjectByKey("hiddenclassimplse"));
        System.out.println(solution.getHiddenClassObjectByKey("hiddenclassimplf"));
        System.out.println(solution.getHiddenClassObjectByKey("packa"));
    }

    public void scanFileSystem() throws ClassNotFoundException {
        File[] files = new File(packageName).listFiles();
        ClassLoaderFromPath classLoaderFromPath = new ClassLoaderFromPath();
        for (File f: files) {
            Class<?> clazz = classLoaderFromPath.loadClass(f.toPath());
            if(clazz != null) {
                hiddenClasses.add(clazz);
            }
        }
    }

    public HiddenClass getHiddenClassObjectByKey(String key) {
        for (Class<?> clazz: hiddenClasses) {
            if(clazz.getSimpleName().toLowerCase().startsWith(key.toLowerCase())){
                try{
                    Constructor[] constructors = clazz.getDeclaredConstructors();
                    for(Constructor constructor: constructors) {
                        if(constructor.getGenericParameterTypes().length == 0) {
                            constructor.setAccessible(true);
                            return (HiddenClass) constructor.newInstance(null);
                        }
                    }
                } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                    return null;
                }
            }
        }
        return null;
    }

    public static class ClassLoaderFromPath extends ClassLoader {

        public Class<?> loadClass(Path path) throws ClassNotFoundException {
            try {
                if(path.getFileName().toString().lastIndexOf(".class") == -1) {
                    return null;
                }
                byte[] b = Files.readAllBytes(path);
                return defineClass(null, b, 0, b.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
