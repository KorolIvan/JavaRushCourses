package java_multithreading.level_7.lesson_4.task_2;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class Solution {
    private final Object lock = new Object();

    public synchronized void firstMethod() {
        synchronized (lock) {
            doSomething();
        }
    }

    public void secondMethod() {
        synchronized (lock){
            synchronized (this){
                doSomething();
            }
        }
    }

    private void doSomething() {
    }

    public static void main(String[] args) {

    }
}
