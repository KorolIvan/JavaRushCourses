package java_multithreading.level_10.lesson_4.task_1;

import java.util.concurrent.TransferQueue;

/**
 * @author Ivan Korol on 9/10/2018
 */
public class Consumer implements Runnable {
    private TransferQueue<ShareItem> queue;
    public Consumer(TransferQueue<ShareItem> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(450);
            while (!Thread.currentThread().isInterrupted()){
                ShareItem item = this.queue.take();
                System.out.format("Processing %s%n", item.toString());
            }
        } catch (InterruptedException e) {
        }
    }
}
