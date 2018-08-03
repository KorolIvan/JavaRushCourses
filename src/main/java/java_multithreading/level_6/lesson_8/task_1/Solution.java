package java_multithreading.level_6.lesson_8.task_1;

/**
 * @author Ivan Korol on 8/3/2018
 */
public class Solution {
    public static void main(String[] args) {

    }

    public static class IntegerHolder {
        private int value;

        public synchronized int get() {
            return value;
        }

        public synchronized void set(int value) {
            this.value = value;
        }
    }
}
