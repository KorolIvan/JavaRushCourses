package java_multithreading.level_9.lesson_5.task_2;

/**
 * @author Ivan Korol on 8/23/2018
 */
public class Solution {
    private Integer[] array = new Integer[]{1, 2, 3, 4};

    public static void main(String[] args) {
        Number value1 = new Solution().getValueByIndex(5); //-1.0, class java.lang.Double expected
        Number value2 = new Solution().getValueByIndex(2); //3, class java.lang.Integer expected

        System.out.println(value1 + ", " + value1.getClass().toString());
        System.out.println(value2 + ", " + value2.getClass().toString());
    }

    Number getValueByIndex(int index) {
        Number n = null;
        if(index >= 0 && index < array.length) {
            n = array[index];
        } else {
            n = new Double(-1);
        }
        return n;
    }
}
