package level_8.lessons_8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task_3 {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Pupkin", 501);
        map.put("Ivanov", 500);
        map.put("Vasiliev", 499);
        map.put("Firstname", 700);
        map.put("Lastname", 1000);
        map.put("Derkach", 200);
        map.put("Koroll", 1500);
        map.put("Korol", 800);
        map.put("Derka", 250);
        map.put("Stalone", 300);
        //напишите тут ваш код
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Integer> iterator = map.values().iterator();
        while (iterator.hasNext()){
            if (iterator.next()<500) {
                iterator.remove();
            }
        }
        for(Map.Entry<String, Integer> pair: map.entrySet()) {
            System.out.println("key " + pair.getKey() +":" + " value " + pair.getValue());
        }
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        removeItemFromMap(createMap());
    }
}
