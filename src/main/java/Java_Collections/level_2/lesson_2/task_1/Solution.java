package Java_Collections.level_2.lesson_2.task_1;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Solution {
    public static void main(String... args) throws IOException {
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];

        RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw");
        long position = randomAccessFile.length() > number ? number : randomAccessFile.length();

        randomAccessFile.seek(position);

        randomAccessFile.write(text.getBytes());
    }
}
