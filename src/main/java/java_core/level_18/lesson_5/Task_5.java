package java_core.level_18.lesson_5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_5 {
    public static void main(String[] args) throws DownloadException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream;
        byte[] buff = null;
        while (true) {
            try {
                String file = reader.readLine();
                inputStream = new FileInputStream(file);
                buff = new byte[inputStream.available()];
                System.out.println(buff.length);
                if (buff.length < 1000) {
                    reader.close();
                    inputStream.close();
                    throw new DownloadException();
                }
            } catch (IOException e) {
               // e.printStackTrace();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
