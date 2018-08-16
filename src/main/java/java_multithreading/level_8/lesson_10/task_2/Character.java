package java_multithreading.level_8.lesson_10.task_2;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Ivan Korol on 8/16/2018
 */
public abstract class Character implements Runnable {
    protected abstract int getId();

    public void run() {
        System.out.println(toString() + " вступил в игру");
        doSomething();
        System.out.println(toString() + " умер");
    }

    private void doSomething() {
        try {
            Thread.currentThread().sleep(ThreadLocalRandom.current().nextInt(10, 100));
        } catch (InterruptedException ignored) {
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " #" + getId();
    }

}
