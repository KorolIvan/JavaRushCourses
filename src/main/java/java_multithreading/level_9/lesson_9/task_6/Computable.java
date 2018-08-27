package java_multithreading.level_9.lesson_9.task_6;

/**
 * @author Ivan Korol on 8/27/2018
 */
public interface Computable<Argument, Value> {
    Value compute(Argument argument) throws InterruptedException;
}

