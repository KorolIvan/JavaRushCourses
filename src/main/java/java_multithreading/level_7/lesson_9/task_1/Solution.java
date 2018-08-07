package java_multithreading.level_7.lesson_9.task_1;

import java.util.concurrent.CountDownLatch;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class Solution {
    CountDownLatch latch = new CountDownLatch(1);

    public void someMethod() throws InterruptedException {
        latch.await();
        retrieveValue();
        latch.countDown();
    }

    void retrieveValue() {
        System.out.println("Value retrieved.");
    }

    public static void main(String[] args) {

    }
}
