package java_multithreading.level_10.lesson_6.task_2;

/**
 * @author Ivan Korol on 9/11/2018
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int number = Integer.MAX_VALUE - 133;
        System.out.println(Integer.toString(number, 2));

        String result = Integer.toString(solution.resetLowerBits(number), 2);
        System.out.println(result);
    }

    public int resetLowerBits(int number) {
        //напишите тут ваш код
        number &= ~(number >> 1);
        number &= ~(number >> 2);
        number &= ~(number >> 4);
        number &= ~(number >> 8);
        number &= ~(number >> 16);
        return number;
    }
}
