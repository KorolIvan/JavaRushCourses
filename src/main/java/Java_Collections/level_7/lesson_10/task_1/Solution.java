package Java_Collections.level_7.lesson_10.task_1;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class Solution {
    public static void main(String[] args) {
        List<Number> numbers = Arrays.<Number>asList(1, 2, 3);
        addDataToList(numbers, getData());
        System.out.println(numbers);
    }

    public static Number[] getData() {
        Number[] result = new Integer[0];
        return result;
    }

    public static void addDataToList(List<Number> list, Number... data) {
        for (Number number : data) {
            list.add(number);
        }
    }
}
