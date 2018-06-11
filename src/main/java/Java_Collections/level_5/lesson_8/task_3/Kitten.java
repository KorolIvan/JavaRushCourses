package Java_Collections.level_5.lesson_8.task_3;

/**
 * @author Ivan Korol on 6/11/2018
 */
public class Kitten extends Cat {

    public Kitten(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Котенок " + name;
    }
}
