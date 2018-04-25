package java_core.level_16.lesson_3;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_1 {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }

    public static class TestThread implements Runnable {

        @Override
        public void run() {
            System.out.println("My first thread");
        }
    }
}
