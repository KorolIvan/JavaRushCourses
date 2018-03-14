package level_18.lesson_5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream inputStream = new FileInputStream(s);
        byte[] buffer = null;
        if (inputStream.available() > 0) {
            buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            int sum = 0;
            for(int i = 0; i < count; i++){
                if (buffer[i] == ',')
                    sum++;
            }
            System.out.println(sum);
        }

        inputStream.close();
    }
}
