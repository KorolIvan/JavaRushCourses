package java_multithreading.level_6.lesson_10.task_3;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Ivan Korol on 8/3/2018
 */
public class Producer implements Runnable {
    private ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        try {
            int i = 1;
            while (true) {

                map.put(String.valueOf(i), "Some text for " + i);
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException e) {
            System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
        }
    }
}
