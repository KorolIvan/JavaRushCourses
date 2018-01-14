package level_13.lesson_11;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream inputStream = new FileInputStream(s);


        while (inputStream.available() > 0) {
            System.out.print((char) inputStream.read());
        }
        System.out.println();
        reader.close();
        inputStream.close();

    }
}
