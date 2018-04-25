package java_core.level_16.lesson_13;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_6 {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountDownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable{
        private int countIndexUp = 0;
        @Override
        public void run() {
            try {
                while (true) {


                    ++countIndexUp;
                    System.out.println(toString());
                    Thread.sleep(500);
                    if(countIndexUp == level_16.lesson_13.Task_6.number) {
                        return;
                    }

                }
            }catch (InterruptedException e){

            }
        }

        @Override
        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }

        //Add your code here - добавь код тут
    }


    public static class CountDownRunnable implements Runnable {
        private int countIndexDown = level_16.lesson_13.Task_6.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }

}
