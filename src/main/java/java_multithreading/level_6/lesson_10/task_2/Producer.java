package java_multithreading.level_6.lesson_10.task_2;

import java.util.concurrent.BlockingQueue;

/**
 * @author Ivan Korol on 8/3/2018
 */
public class Producer implements Runnable {

    private BlockingQueue queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            int i = 0;
            while (true) {
                queue.put(String.valueOf(i++));
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
        }
    }
}
