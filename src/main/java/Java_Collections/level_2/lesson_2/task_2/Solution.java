package Java_Collections.level_2.lesson_2.task_2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];

        RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw");
        randomAccessFile.seek(number);
        byte[] buffer = new byte[text.length()];
        randomAccessFile.read(buffer,0, buffer.length);
        String textForCheck = new String(buffer);
        String writeToFile = textForCheck.equals(text)
                ? "true" : "false";
        randomAccessFile.seek(randomAccessFile.length());
        randomAccessFile.write(writeToFile.getBytes());
    }
}
