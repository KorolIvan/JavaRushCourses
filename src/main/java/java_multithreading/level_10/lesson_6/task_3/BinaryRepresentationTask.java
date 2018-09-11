package java_multithreading.level_10.lesson_6.task_3;

import java.util.concurrent.RecursiveTask;

/**
 * @author Ivan Korol on 9/11/2018
 */
public class BinaryRepresentationTask extends RecursiveTask<String> {
    private int x;

    public BinaryRepresentationTask(int x) {
        this.x = x;
    }

    @Override
    protected String compute() {
        int a = x % 2;
        int b = x / 2;
        String result = String.valueOf(a);
        if (b > 0) {
            BinaryRepresentationTask task = new BinaryRepresentationTask(b);
            task.fork();
            return task.join() + result;
        }
        return result;
    }
}
