package java_core.level_16.lesson_10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_5 {
    public static byte countThreads = 3;
    static List<Thread> threads = new ArrayList<Thread>(countThreads);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }


    public static void ourInterruptMethod() {
        //add your code here - добавь код тут
        for(Thread i: threads){
            i.interrupt();
        }
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < countThreads; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < countThreads; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String commonResource;

        public Water(String commonResource) {
            this.commonResource = commonResource;
        }

        public void run() {
            //fix 2 variables - исправь 2 переменных
            boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();
            String threadName = Thread.currentThread().getName();

            try {
                while (!isCurrentThreadInterrupted) {

                    System.out.println("Объект " + commonResource + ", нить " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
