package Java_Collections.level_5.lesson_8.task_3;

/**
 * @author Ivan Korol on 6/11/2018
 */
public class Dog {
    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Пес " + name;
    }
}
