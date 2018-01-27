package level_15.lesson_12.Task_7;

import java.io.*;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new FileReader(Statics.FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null) {
               lines.add(line);
            }
        } catch (FileNotFoundException e){

        } catch (IOException e) {
            // log error
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    // log warning
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
