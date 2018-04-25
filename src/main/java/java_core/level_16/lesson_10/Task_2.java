package java_core.level_16.lesson_10;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_2 {
    public static volatile int countSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            while(countSeconds > 0) {
                try {
                    System.out.print(countSeconds + " ");
                    countSeconds--;
                    Thread.sleep(1000);
                    if (countSeconds == 0) {
                        this.interrupt();
                        System.out.println("Марш!");

                    }
                }catch (InterruptedException e) {
                    System.out.println("Прервано!");
                }
            }
        }
    }
}
