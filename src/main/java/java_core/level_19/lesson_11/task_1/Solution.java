package java_core.level_19.lesson_11.task_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Ivan Korol on 4/26/2018
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(args[0]);
        BufferedReader reader1 = new BufferedReader(reader);
        TreeMap<String, Double> map = new TreeMap<>();
        while (reader1.ready()){
            String[] line = reader1.readLine().split(" ");
            if(!map.containsKey(line[0])){
                map.put(line[0], Double.parseDouble(line[1]));
            }else {
                map.put(line[0], map.get(line[0])+Double.parseDouble(line[1]));
            }

        }
        reader.close();
        reader1.close();
        for (Map.Entry<String, Double> pair:
             map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
