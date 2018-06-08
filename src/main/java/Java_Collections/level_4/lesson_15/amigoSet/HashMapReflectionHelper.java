package Java_Collections.level_4.lesson_15.amigoSet;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @author Ivan Korol on 6/8/2018
 */
public class HashMapReflectionHelper {
    public static <T> T callHiddenMethod(HashMap map, String methodName) {
        try {
            Method method = map.getClass().getDeclaredMethod(methodName);
            method.setAccessible(true);
            return (T) method.invoke(map);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException ignored) {
        }
        return null;
    }
}
