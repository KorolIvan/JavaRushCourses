package level_18.lesson_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task_5 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream inputStream = new FileInputStream(s);
        Set<Byte> set = new TreeSet<>();
        while (inputStream.available() > 0) {
            set.add((byte)inputStream.read());
        }
        inputStream.close();
        if (!set.isEmpty()) {
           Iterator<Byte> iterable = set.iterator();
           while (iterable.hasNext()) {
               System.out.print((int)iterable.next() + " ");
           }
        }

    }
}
