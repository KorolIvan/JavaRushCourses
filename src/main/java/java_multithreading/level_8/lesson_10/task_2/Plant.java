package java_multithreading.level_8.lesson_10.task_2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Ivan Korol on 8/16/2018
 */
public class Plant extends Character {
    private final static AtomicInteger idSequence = new AtomicInteger();
    private final int id = idSequence.incrementAndGet();

    protected int getId() {
        return id;
    }
}
