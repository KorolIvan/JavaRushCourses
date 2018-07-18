package java_multithreading.level_2.lesson_9.task_2;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Ivan Korol on 7/18/2018
 */
public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name","Ivanov");
        map.put("country","Ukraine");
        map.put("city","Kiev");
        map.put("age",null);
        map.put("name1","Ivanov");
        map.put("name2","Ivanov");

        System.out.println(getQuery(map));
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder result = new StringBuilder();
        if (params == null || params.isEmpty())
            return result.toString();

        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getKey() == null || pair.getValue() == null)
                continue;

            result.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
        }

        if (result.length() > 5)
            result.delete(result.length() - 5, result.length());

        return result.toString();
    }
}
