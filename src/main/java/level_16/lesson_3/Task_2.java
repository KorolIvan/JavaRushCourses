package level_16.lesson_3;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_2 {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }

    public static class TestThread extends Thread {
        static {
            System.out.println("it's a static block inside TestThread");
        }

        public void run(){
            System.out.println("it's a run method");
        }
    }
}
