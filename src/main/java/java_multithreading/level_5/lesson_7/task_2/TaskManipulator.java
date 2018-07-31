package java_multithreading.level_5.lesson_7.task_2;

/**
 * @author Ivan Korol on 7/31/2018
 */
public class TaskManipulator implements Runnable, CustomThreadManipulator {
    private Thread thread;
    @Override
    public void run() {
        try {
            while (!thread.isInterrupted()) {
                Thread.sleep(0);
                System.out.println(thread.getName());
                Thread.sleep(100);
            }

        } catch (InterruptedException e) {
            //e.printStackTrace();
        }
    }

    @Override
    public void start(String threadName) {
        this.thread = new Thread(this);
        this.thread.setName(threadName);
        this.thread.start();
    }

    @Override
    public void stop() {
        thread.interrupt();
    }
}
