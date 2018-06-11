package Java_Collections.level_5.lesson_8.task_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ivan Korol on 6/11/2018
 */
public class ConvertableUtil {
    public static <T extends Convertable> Map convert(List<T> list) {
        Map result = new HashMap();
        for(T item: list) {
            result.put(item.getKey(), item);
        }
        return result;
    }
}
