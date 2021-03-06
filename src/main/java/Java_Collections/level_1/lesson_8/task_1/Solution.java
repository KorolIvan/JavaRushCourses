package Java_Collections.level_1.lesson_8.task_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Ivan Korol on 5/8/2018
 */
public class Solution {
    private FileData fileData;

    public Solution(String pathToFile) {
        try {
            boolean hidden = Files.isHidden(Paths.get(pathToFile));
            boolean executable = Files.isExecutable(Paths.get(pathToFile));
            boolean directory = Files.isDirectory(Paths.get(pathToFile));
            boolean writable = Files.isWritable(Paths.get(pathToFile));

            fileData = new ConcreteFileData(hidden, executable, directory, writable);

        } catch (IOException e) {
            fileData = new NullFileData(e);
        }
    }

    public FileData getFileData() {
        return fileData;
    }
}
