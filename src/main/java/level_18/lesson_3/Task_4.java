package level_18.lesson_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Task_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        FileInputStream inputStream = new FileInputStream(s);
        ArrayList<Byte> list = new ArrayList<>();
        int count = 0;
        while (inputStream.available() > 0){
            list.add((byte) inputStream.read());
        }
        HashMap<Byte, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            count = Collections.frequency(list, list.get(i));
            map.put(list.get(i), count);
        }
        if (!map.isEmpty()) {
            int min = Collections.min(map.values());
            for (HashMap.Entry<Byte, Integer> pair:
                    map.entrySet()) {
                if (pair.getValue() == min) {
                    System.out.print(pair.getKey() + " ");
                }
            }
        }
        inputStream.close();
    }
}
