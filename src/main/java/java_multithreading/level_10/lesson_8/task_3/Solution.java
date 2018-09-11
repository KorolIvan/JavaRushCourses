package java_multithreading.level_10.lesson_8.task_3;

/**
 * @author Ivan Korol on 9/11/2018
 */
public class Solution {
    public static void main(String[] args) {
        /* expected output
        x=4, y=5
        x=5, y=4
         */

        Pair pair = new Pair(4, 5);
        System.out.println(pair);
        pair.swap();
        System.out.println(pair);
    }
}
