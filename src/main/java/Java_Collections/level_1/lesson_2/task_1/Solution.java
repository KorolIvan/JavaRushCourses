package Java_Collections.level_1.lesson_2.task_1;

import java.io.*;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Ivan Korol on 5/7/2018
 */
public class Solution {
    public static void main(String[] args) {
        ArrayList<File> fileArrayList = new ArrayList<>();
        //File path = new File(args[0]);
        File path = new File("C:\\for test");
        File resultFileAbsolutePath = new File("C:\\for test\\file 1.txt");
        //File resultFileAbsolutePath = new File(args[1]);
        File allFilesContent = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);
        try (FileOutputStream writer = new FileOutputStream(allFilesContent)) {
            ArrayList<File> list = new ArrayList<>();
            Files.walkFileTree(path.toPath(), new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (file.toFile().length() > 50) {
                        FileUtils.deleteFile(file.toFile());
                    }
                    else {
                        list.add(file.toFile());
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
            list.sort(Comparator.comparing(File::getName));
            for (File file : list) {
                System.out.println(file);
                FileReader reader = new FileReader(file);
                int symbol;
                while ((symbol = reader.read()) != -1) {
                    writer.write(symbol);
                }
                reader.close();
                writer.write('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
