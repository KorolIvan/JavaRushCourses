package java_multithreading.level_2.lesson_7.task_1;

/**
 * @author Ivan Korol on 7/18/2018
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), 20.0 / 7.0, 10.0 / 3.0));
        //должен быть вывод
        //20 / 7 = 2,86
        //Exp = 3,33e+00
    }

    public static String getFormattedString() {
        return "20 / 7 = %.2f%nExp = %.2e";
    }
}