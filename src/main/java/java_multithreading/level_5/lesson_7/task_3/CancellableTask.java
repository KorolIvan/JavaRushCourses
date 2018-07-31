package java_multithreading.level_5.lesson_7.task_3;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/**
 * @author Ivan Korol on 7/31/2018
 */
public interface CancellableTask<T> extends Callable<T> {
    void cancel();

    RunnableFuture<T> newTask();
}
