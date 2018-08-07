package java_multithreading.level_7.lesson_9.task_2;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class ConsumerTask implements Runnable {
    private TransferObject transferObject;
    protected volatile boolean stopped;

    public ConsumerTask(TransferObject transferObject) {
        this.transferObject = transferObject;
        new Thread(this, "ConsumerTask").start();
    }

    public void run() {
        synchronized (transferObject) {
            while (!stopped) {
                transferObject.get();
            }
        }
    }

    public void stop() {
        stopped = true;
    }
}
