package java_multithreading.level_3.lesson_6.task_1;

/**
 * @author Ivan Korol on 7/20/2018
 */
public class Solution {
    public static final String TEST = "test";

    public static class TEST {
        @Override
        public String toString() {
            return "test class";
        }
    }

    static Object obj;

    public static void main(String[] args) {
        obj = new Solution.TEST();
        System.out.println(obj);
    }
}
