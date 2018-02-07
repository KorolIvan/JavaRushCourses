package level_16.lesson_10;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static boolean varForClose = false;

    public static void ourInterruptMethod() {
        varForClose = true;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (!varForClose) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                }
            }
        }
    }
}
