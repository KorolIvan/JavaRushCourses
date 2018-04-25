package java_core.level_19.lesson_5.task_3;

import java.io.*;

/**
 * @author Ivan Korol on 4/23/2018
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader cmdReader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = cmdReader.readLine();
        String fileTwo = cmdReader.readLine();
        cmdReader.close();

        BufferedReader reader = new BufferedReader(new FileReader(fileOne));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileTwo));
        StringBuilder temp = new StringBuilder();
        while (reader.ready()) {
            temp.append(reader.readLine());
        }
        String fullText = temp.toString();
        String[] digital = fullText.split("\\s");
        for (String s : digital) {
            try {
                System.out.println(Integer.parseInt(s));
                writer.write(s+ " ");
            }catch (NumberFormatException ex) {
                continue;
            }

        }
        reader.close();
        writer.close();
    }
}
