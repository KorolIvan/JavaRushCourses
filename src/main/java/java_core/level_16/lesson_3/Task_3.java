package java_core.level_16.lesson_3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_3 {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread specialThread1 = new SpecialThread();
        SpecialThread specialThread2 = new SpecialThread();
        SpecialThread specialThread3 = new SpecialThread();
        SpecialThread specialThread4 = new SpecialThread();
        SpecialThread specialThread5 = new SpecialThread();

        Thread thread1 = new Thread(specialThread1);
        Thread thread2 = new Thread(specialThread2);
        Thread thread3 = new Thread(specialThread3);
        Thread thread4 = new Thread(specialThread4);
        Thread thread5 = new Thread(specialThread5);

        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}