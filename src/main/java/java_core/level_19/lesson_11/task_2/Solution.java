package java_core.level_19.lesson_11.task_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Ivan Korol on 4/26/2018
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();
        while (reader.ready()) {
            String[] values = reader.readLine().split(" ");
            if(map.containsKey(values[0])){
                map.put(values[0], map.get(values[0])+Double.parseDouble(values[1]));
            }else {
                map.put(values[0], Double.parseDouble(values[1]));
            }
        }
        reader.close();
        double max = 0;
        for(Double d: map.values()){
            if(max < d)
                max = d;
        }

        for (Map.Entry<String, Double> pair: map.entrySet()) {
            if(pair.getValue() == max) {
                System.out.println(pair.getKey());
            }
        }

    }
}
