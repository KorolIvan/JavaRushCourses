package java_core.level_13.lesson_11.Task_12;



import java.util.List;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class RepkaStory {

    static void tell(List<Person> items) {
        Person first;
        Person second;
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i);
            second = items.get(i-1);
            first.pull(second);
        }
    }
}
