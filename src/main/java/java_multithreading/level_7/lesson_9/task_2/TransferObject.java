package java_multithreading.level_7.lesson_9.task_2;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class TransferObject {
    private int value;
    protected volatile boolean isValuePresent = false; //use this variable

    public synchronized int get() {
        while (!isValuePresent) {
            try {
                this.wait();
            }
            catch (InterruptedException e) {}
        }
        System.out.println("Got: " + value);
        isValuePresent = false;
        notify();
        return value;
    }

    public synchronized void put(int value) {
        while (isValuePresent) {
            try {
                this.wait();
            }
            catch (InterruptedException e) {}
        }
        this.value = value;
        isValuePresent = true;
        System.out.println("Put: " + value);
        notify();
    }
}
