package java_multithreading.level_9.lesson_7.task_2;

/**
 * @author Ivan Korol on 8/27/2018
 */
public class Solution {
    public static void main(String[] args) {
        Integer a = getValue(Boolean.TRUE, Boolean.TRUE);   //100 expected
        Integer b = getValue(Boolean.FALSE, Boolean.TRUE);  //200 expected
        Integer c = getValue(Boolean.FALSE, Boolean.FALSE); //null expected

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static Integer getValue(boolean first, boolean second) {
        return first ? (Integer) 100 : second ? 200 : null;
    }
}
