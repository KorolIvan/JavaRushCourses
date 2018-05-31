package Java_Collections.level_4.lesson_2.task_3;

/**
 * @author Ivan Korol on 5/31/2018
 */
public class Solution {
    public void recursion(int n) {
        int a = 2;
        while (a <= n) {
            if ((n % a) == 0) {
                if (a != n) {
                    System.out.print(a + " ");
                    recursion(n / a);
                } else {
                    System.out.print(a);
                }
                return;
            }
            a++;
        }
    }

    public static void main(String[] args) {
        new Solution().recursion(132);
    }
}
