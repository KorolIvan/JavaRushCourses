package Java_Collections.level_9.lesson_9.task_11.workers;

/**
 * @author Ivan Korol on 7/16/2018
 */
public class NormalWorker implements Worker, Sleeper, Eater {
    @Override
    public void work() {
        System.out.println("NormalWorker is working!");
    }

    @Override
    public void eat() {
        System.out.println("NormalWorker is eating!");
    }

    @Override
    public void sleep() {
        System.out.println("NormalWorker is sleeping!");
    }
}
