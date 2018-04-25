package java_core.level_15.lesson_9;

import java.util.HashMap;
import java.util.Map;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_1 {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(0.1, "1");
        labels.put(0.2, "2");
        labels.put(0.3, "3");
        labels.put(0.4, "4");
        labels.put(0.5, "5");
    }
    public static void main(String[] args) {
        System.out.println(labels);
    }
}
