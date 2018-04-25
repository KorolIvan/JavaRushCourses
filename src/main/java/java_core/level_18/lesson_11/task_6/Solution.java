package java_core.level_18.lesson_11.task_6;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

        while (inputStream.available()>0){
            int i = inputStream.read();
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        inputStream.close();

        for(Map.Entry<Integer, Integer> mapp: map.entrySet()) {
            System.out.println((char) Integer.parseInt(mapp.getKey().toString()) + " " + mapp.getValue());
        }
    }
}
