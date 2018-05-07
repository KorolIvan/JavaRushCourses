package java_core.level_20.lesson_10.task_10;

import java.util.*;

/**
 * @author Ivan Korol on 5/4/2018
 */

//todo complete this task still not passed on the platform
public class Solution {
    public static long[] getNumbers(long N) {
        long[] result = null;
        List<Long> list = new ArrayList<>();

        for (int i = 1 ; i < N ; i ++) {

            long degree = getDegree(i);

            long digit;
            long sum = 0;
            long number = i;

            do {

                digit = number % 10;
                long multiply = digit;
                for (int j = 1; j < degree; j++) {
                    multiply = multiply * digit;
                }
                sum = sum + multiply;
                if (sum > i) break;

            } while ((number /= 10) > 0);

            if (sum == i) {
                list.add(sum);
            }
        }

        result = new long[list.size()];
        for (int i =0 ; i < result.length; i ++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static long getDegree (long N) {
        long i = 0;
        do {
            i++;
            N = N / 10;
        } while (N > 0);
        return i;
    }

    public static void main(String[] args) {
        Long t0 = System.currentTimeMillis();
        long[] numbers = getNumbers(Integer.MAX_VALUE);
//        long[] numbers = getNumbers(146511208);
//        int[] numbers = getNumbers(100);
        Long t1 = System.currentTimeMillis();
        System.out.println("time: " + (t1 - t0) / 1000d + " sec");
        System.out.println("memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024) + " mb");
        System.out.println(Arrays.toString(numbers));
    }
}
