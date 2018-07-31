package java_multithreading.level_5.lesson_5.task_3;

/**
 * @author Ivan Korol on 7/31/2018
 */
public class LoggingStateThread extends Thread {
    private Thread thread;
    public LoggingStateThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        Thread.State currentState = thread.getState();
        System.out.println(currentState);
        super.run();
        while (!currentState.equals(State.TERMINATED)) {
            Thread.State newState = thread.getState();
            if (!newState.equals(currentState)) {
                System.out.println(newState);
                currentState = newState;
            }
        }
        this.interrupt();
    }
}
