package Java_Collections.level_9.lesson_9.task_11.workers;

/**
 * @author Ivan Korol on 7/16/2018
 */
public class LazyPerson implements Sleeper, Eater {

    @Override
    public void eat() {
        System.out.println("LazyPerson is eating!");
    }

    @Override
    public void sleep() {
        System.out.println("LazyPerson is sleeping!");
    }
}
