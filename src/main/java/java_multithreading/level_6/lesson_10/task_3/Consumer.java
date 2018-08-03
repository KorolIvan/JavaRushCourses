package java_multithreading.level_6.lesson_10.task_3;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Ivan Korol on 8/3/2018
 */
public class Consumer implements Runnable {
    private ConcurrentHashMap<String, String> map;

    public Consumer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    public void run() {
        Thread currentThread = Thread.currentThread();
        while (!currentThread.isInterrupted()) {
            if (!map.isEmpty()) {
                for (String key : map.keySet()) {
                    System.out.println(map.remove(key));
                }
            }
        }
    }
}
