package Java_Collections.level_1.lesson_2.task_1;

import java.io.File;

/**
 * @author Ivan Korol on 5/7/2018
 */
public class FileUtils {
    public static void deleteFile(File file) {
        if (!file.delete()) System.out.println("Can not delete file with name " + file.getName());
    }

    public static void renameFile(File source, File destination) {
        if (!source.renameTo(destination)) System.out.println("Can not rename file with name " + source.getName());
    }

    public static boolean isExist(File file) {
        return file.exists();
    }
}
