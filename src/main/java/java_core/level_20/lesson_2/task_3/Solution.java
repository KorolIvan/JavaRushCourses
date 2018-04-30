package java_core.level_20.lesson_2.task_3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author Ivan Korol on 4/30/2018
 */
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static Properties property = new Properties();
    public static String fileName;

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fileName = reader.readLine();
        reader.close();
        FileInputStream inputStream = new FileInputStream(Solution.fileName);
        load(inputStream);
        inputStream.close();
        //implement this method - реализуйте этот метод
    }

    public void save(OutputStream outputStream) throws Exception {
        property.clear();
        for (Map.Entry<String, String> map:
             properties.entrySet()) {
            property.put(map.getKey(), map.getValue());
        }
        property.store(outputStream, "");
        //implement this method - реализуйте этот метод
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        property.load(inputStream);
        for (Map.Entry<Object, Object> map:
             property.entrySet()) {
            properties.put((String) map.getKey(), (String) map.getValue());
        }

    }

    public static void main(String[] args) {

    }
}
