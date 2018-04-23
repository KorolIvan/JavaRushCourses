package level_19.lesson_5.task_1;

import java.io.*;

/**
 * @author Ivan Korol on 4/23/2018
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(fileOne);
        FileWriter fileWriter = new FileWriter(fileTwo);
        int i = 1;
        while (fileReader.ready()) {
            int data = fileReader.read();
            if(i%2 == 0){
                fileWriter.write(data);
            }
            i++;
        }

        fileReader.close();
        fileWriter.close();

    }
}
