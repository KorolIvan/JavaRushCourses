package java_core.level_19.lesson_11.task_5;

import java.io.*;

/**
 * @author Ivan Korol on 4/26/2018
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        while (reader.ready()) {
            String line = reader.readLine();
            String[] words = line.split(" ");
            for(String w: words) {
                if(!w.matches("^\\D*$")){
                    writer.write(w + " ");
                }
            }
        }
        reader.close();
        writer.close();
    }
}
