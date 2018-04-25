package level_10.lessons_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task_12 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int id;
        String name;
        while (true){
            try {
                id = Integer.parseInt(reader.readLine());
            }catch (NumberFormatException e){
                break;
            }

            name = reader.readLine();
            map.put(name, id);
        }

        for (Map.Entry<String, Integer> m:
             map.entrySet()) {
            System.out.println(m.getValue() + " " + m.getKey());
        }

    }
}
