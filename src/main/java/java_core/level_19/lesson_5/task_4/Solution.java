package java_core.level_19.lesson_5.task_4;

import java.io.*;

/**
 * @author Ivan Korol on 4/23/2018
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new  BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileOne));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileTwo));
        while (fileReader.ready()) {
            String s = fileReader.readLine();
            fileWriter.write(s.replace(".", "!"));
        }
        fileReader.close();
        fileWriter.close();
    }
}
