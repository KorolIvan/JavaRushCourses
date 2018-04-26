package java_core.level_19.lesson_11.task_7;

import java.io.*;

/**
 * @author Ivan Korol on 4/26/2018
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder builder = new StringBuilder();
        while (reader.ready()) {
            String[] words = reader.readLine().split(" ");
            for(String s : words) {
                if (s.length() > 6) {
                    builder.append(s).append(",");
                }
            }
        }
        builder.delete(builder.length()-1, builder.length());
        writer.write(builder.toString());
        reader.close();
        writer.close();
    }
}
