package java_multithreading.level_10.lesson_6.task_3;

import java.util.concurrent.ForkJoinPool;

/**
 * @author Ivan Korol on 9/11/2018
 */
public class Solution {
    private String binaryRepresentationMethod(int x) {
        int a = x % 2;
        int b = x / 2;
        String result = String.valueOf(a);
        if (b > 0) {
            return binaryRepresentationMethod(b) + result;
        }
        return result;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String result1 = solution.binaryRepresentationMethod(6);
        System.out.println(result1);

        System.out.println();
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        String result2 = forkJoinPool.invoke(new BinaryRepresentationTask(6));
        System.out.println(result2);
    }
}
