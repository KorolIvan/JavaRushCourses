package java_multithreading.level_4.lesson_6.task_3;

import java.util.List;

/**
 * @author Ivan Korol on 7/27/2018
 */
public class Solution {

    public static List<Jeans> allJeans = Util.getAllJeans();

    public static void main(String[] args) {
        for (Jeans jeans : allJeans) {
            System.out.println(jeans);
        }
    }

}
