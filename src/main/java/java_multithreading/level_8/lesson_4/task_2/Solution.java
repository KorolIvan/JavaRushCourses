package java_multithreading.level_8.lesson_4.task_2;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class Solution {
    public static int getRandomIntegerBetweenNumbers(int from, int to) {
        int i = ThreadLocalRandom.current().nextInt(from, to);
        return i;
    }

    public static double getRandomDouble() {
        double dbl = ThreadLocalRandom.current().nextDouble();
        return dbl;
    }

    public static long getRandomLongBetween0AndN(long n) {
        long l = ThreadLocalRandom.current().nextLong(n);
        return l;
    }

    public static void main(String[] args) {
    }
}
