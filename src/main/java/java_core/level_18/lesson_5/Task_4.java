package java_core.level_18.lesson_5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Task_4 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String in = reader.readLine();
        String out = reader.readLine();
        FileInputStream inputStream = new FileInputStream(in);
        FileOutputStream outputStream = new FileOutputStream(out);

        byte[] buffer = new byte[inputStream.available()];
        int[] temp = new int[buffer.length];
        if(inputStream.available()>0){
            for (int i = buffer.length-1; i>=0 ; i--) {
                temp[i] = inputStream.read();
            }
            for (int i: temp) {
                outputStream.write(i);
            }
        }


        inputStream.close();
        outputStream.close();

    }
}
