package java_multithreading.level_3.lesson_8.task_1;

/**
 * @author Ivan Korol on 7/23/2018
 */
public class Solution {
    private String name;

    Solution(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void sout() {
        new Solution("sout") {
            void printName() {
                System.out.println(getName());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new Solution("main").sout();
    }
}
