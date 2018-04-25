package java_core.level_16.lesson_13;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_2 {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread().join();
            //напишите тут ваш код
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countDownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while (true) {
                System.out.println(this);
                if (--countDownIndex == 0) return;
                try {
                    Thread.sleep(10);//напишите тут ваш код
                } catch (InterruptedException e) {
                    System.out.println("Нить прервана");
                }
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countDownIndex;
        }
    }
}
