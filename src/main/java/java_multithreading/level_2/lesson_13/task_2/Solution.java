package java_multithreading.level_2.lesson_13.task_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ivan Korol on 7/19/2018
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]);

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);

        fileOutputStream.write(new String(buffer, "Windows-1251").getBytes("UTF-8"));

        fileInputStream.close();
        fileOutputStream.close();
    }
}
