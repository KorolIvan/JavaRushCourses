package level_8.lessons_9;

import java.util.HashMap;
import java.util.Map;

public class Task_3 {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> peaple = new HashMap<String, String>();
        peaple.put("Pupkin", "Ivan");
        peaple.put("Ivanov", "Stephan");
        peaple.put("Petrov", "Vasiliy");
        peaple.put("Sidorov", "Arkasha");
        peaple.put("Pupkin", "Aly");
        peaple.put("Vasiliev", "Vasya");
        peaple.put("Stalone", "Artur");
        peaple.put("Ivanov", "Ivan");
        peaple.put("Kucenko", "Gosha");
        peaple.put("Popovich", "Alosha");

        return peaple;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
