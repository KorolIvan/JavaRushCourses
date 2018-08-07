package java_multithreading.level_7.lesson_9.task_2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class ProducerTask implements Runnable {
    private TransferObject transferObject;
    protected volatile boolean stopped;
    static volatile AtomicInteger i = new AtomicInteger(0);

    public ProducerTask(TransferObject transferObject) {
        this.transferObject = transferObject;
        new Thread(this, "ProducerTask").start();
    }

    public void run() {
        synchronized (transferObject) {
            while (!stopped) {
                transferObject.put(i.incrementAndGet());
            }
        }
    }

    public void stop() {
        stopped = true;
    }
}
