package java_multithreading.level_9.lesson_2.task_2;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Ivan Korol on 8/23/2018
 */
public class Solution {
    public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
        Solution solution = new Solution();
        String fileNameToBeOpenedByNotepad = solution.getAbsolutePathToDefaultTxtFile().toString();
        Process notepad = solution.getProcessStartNotepad(fileNameToBeOpenedByNotepad);
        notepad.waitFor();
    }

    public Process getProcessStartNotepad(String fileName) throws IOException {
        String[] cmdArray = new String[]{"notepad.exe", fileName};
        return Runtime.getRuntime().exec(cmdArray);
    }

    public Path getAbsolutePathToDefaultTxtFile() throws URISyntaxException {
        URI uri = Solution.class.getResource("file.txt").toURI();
        return  Paths.get(uri);
    }
}
