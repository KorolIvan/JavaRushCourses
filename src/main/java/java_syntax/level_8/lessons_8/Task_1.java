package level_8.lessons_8;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task_1 {

    @Deprecated
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone_0", new Date("JUNE 1 1980"));
        map.put("Stallone_1", new Date("JULY 1 1980"));
        map.put("Stallone_2", new Date("AUGUST 1 1980"));
        map.put("Stallone_3", new Date("NOVEMBER 1 1980"));
        map.put("Stallone_4", new Date("MAY 1 1980"));
        map.put("Stallone_5", new Date("MARCH 1 1980"));
        map.put("Stallone_6", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone_7", new Date("FEBRUARY 1 1980"));
        map.put("Stallone_8", new Date("APRIL 1 1980"));
        map.put("Stallone_9", new Date("OCTOBER 1 1980"));

        //напишите тут ваш код
        return map;
    }
    @Deprecated
    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Date> it = map.values().iterator();
        while (it.hasNext()) {
            Date date = it.next();
            if (date.getMonth() >= 5 && date.getMonth() <= 7)
                it.remove();
        }

        if (!map.isEmpty()) {
            for (Map.Entry<String, Date> pair:
                    map.entrySet()) {

                System.out.println("key " + pair.getKey() +":" + " value " + pair.getValue());

            }
        }else {
            System.out.println(" map is empty");
        }
    }

    @Deprecated
    public static void main(String[] args) {
        removeAllSummerPeople(createMap());
    }
}
