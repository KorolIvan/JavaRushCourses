package Java_Collections.level_2.lesson_4.task_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;

public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("text1.txt"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        StringWriter stringWriter = new StringWriter();
        int a = 0;
        try {
            while (is.available() > 0)  {
                stringWriter.append(Character.toString((char) (a = is.read())));
            }
        }catch (Exception ex) {
            return new StringWriter();
        }
        return stringWriter;
    }
}
