package Java_Collections.level_5.lesson_8.test_4;

/**
 * @author Ivan Korol on 6/11/2018
 */
public class Event {
    private static int nextId = 1;

    private int id;

    public Event() {
        id = nextId++;
    }

    public int getId() {
        return id;
    }
}
