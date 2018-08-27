package java_multithreading.level_9.lesson_9.task_1;

import java.math.BigDecimal;

/**
 * @author Ivan Korol on 8/27/2018
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getValue(1.1d, 1.2d));
    }

    public static BigDecimal getValue(double v1, double v2) {
        return new BigDecimal(v1 + "").add(new BigDecimal(v2 + ""));
    }
}
