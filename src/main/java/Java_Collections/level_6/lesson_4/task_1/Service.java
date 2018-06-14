package Java_Collections.level_6.lesson_4.task_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan Korol on 6/14/2018
 */
public class Service {

    public List<String> getData() {
        List<String> data = new ArrayList<String>() {{
            add("First string");
            add("Second string");
            add("Third string");
        }};
        return data;
    }
}
