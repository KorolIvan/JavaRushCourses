package java_multithreading.level_7.lesson_9.task_2;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class Solution {
    public static void main(String args[]) throws InterruptedException {
        TransferObject transferObject = new TransferObject();
        ProducerTask producerTask = new ProducerTask(transferObject);
        ConsumerTask consumerTask = new ConsumerTask(transferObject);

        Thread.sleep(50);
        producerTask.stop();
        consumerTask.stop();
    }
}
