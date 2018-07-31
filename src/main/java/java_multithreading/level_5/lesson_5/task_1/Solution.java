package java_multithreading.level_5.lesson_5.task_1;

/**
 * @author Ivan Korol on 7/31/2018
 */
public class Solution {
    public static void processThreads(Thread... threads) {
        //implement this method - реализуйте этот метод
        for (Thread thread : threads) {
            switch (thread.getState()) {
                case NEW:
                    thread.start();
                    break;
                case WAITING:
                    thread.interrupt();
                    break;
                case TIMED_WAITING:
                    thread.interrupt();
                    break;
                case BLOCKED:
                    thread.interrupt();
                    break;
                case RUNNABLE:
                    thread.isInterrupted();
                    break;
                case TERMINATED:
                    System.out.println(thread.getPriority());
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread();
        }
        Solution.processThreads(threads);
        threads[0].interrupt();
        try {
            threads[1].join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Solution.processThreads(threads);
    }
}


