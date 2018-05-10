package Java_Collections.level_1.lesson_15.task_1;

import java.util.List;

/**
 * @author Ivan Korol on 5/10/2018
 */
public class Solution {
    public static void main(String[] args) {
        List<String> list = new CustomTree();
        for (int i = 1; i < 16; i++) {
            list.add(String.valueOf(i));
        }

        System.out.println("List size is " + list.size());
        System.out.println("Expected parent is 3, actual parent is " + ((CustomTree) list).getParent("8"));
        System.out.println("Expected parent is null, actual parent is " + ((CustomTree) list).getParent("20"));
    }
}
