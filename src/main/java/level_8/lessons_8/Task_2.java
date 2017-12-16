package level_8.lessons_8;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Pupkin", "Artur");
        map.put("Ivanov", "Ivan");
        map.put("Vasiliev", "Ivan");
        map.put("Firstname", "Ivan");
        map.put("Lastname", "Irina");
        map.put("Derkach", "Vasiviy");
        map.put("Koroll", "Alona");
        map.put("Korol", "Kseniya");
        map.put("Derka", "Nina");
        map.put("Stalone", "Silvester");
        //напишите тут ваш код
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> temp = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : temp.entrySet())
        {
            String value = pair.getValue();
            int count=0;
            for (Map.Entry<String, String> pair1 : temp.entrySet())
            {
                if (pair1.getValue() == value) {
                    count ++;
                }
            }
            if(count>1)
            {
                removeItemFromMapByValue(map, value);
                //break;
            }
        }

        for (Map.Entry<String, String > pair:
             map.entrySet()) {
            System.out.println("Key "+pair.getKey()+" : "+"value " + pair.getValue());
        }
        System.out.println(map.size());
        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
