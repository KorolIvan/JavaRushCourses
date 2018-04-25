package java_core.level_18.lesson_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(s);
        int sum = 0;
        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            if (data > sum) {
                sum = data;
            }
        }
        fileInputStream.close();
        System.out.println(sum);
    }
}
