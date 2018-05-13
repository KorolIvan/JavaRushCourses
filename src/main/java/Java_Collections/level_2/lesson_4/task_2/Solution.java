package Java_Collections.level_2.lesson_4.task_2;

import java.io.IOException;
import java.io.StringReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        int a = 0;
        StringBuilder builder = new StringBuilder();
        try {
            while ((a = reader.read()) != -1) {
                builder.append(Character.toString((char) (a+key)));
            }
        }catch (Exception e) {
            return new String();
        }
        return builder.toString();
    }
}
