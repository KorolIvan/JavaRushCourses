package level_9.lesson_6;

import java.util.HashMap;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_5 {
    public static void main(String[] args) {
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}
