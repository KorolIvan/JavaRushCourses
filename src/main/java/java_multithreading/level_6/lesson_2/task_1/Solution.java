package java_multithreading.level_6.lesson_2.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Ivan Korol on 8/2/2018
 */
public class Solution {
    public static void main(String[] args) {

    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here
        Arrays.sort(array);
        int len = array.length;
        int mediana = len % 2 != 0 ? array[len / 2] : (int) ((array[len / 2] + array[len / 2 - 1]) / 2);

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1 - mediana) - Math.abs(o2 - mediana);
            }
        };

//        то же самое через лямбду
//        Comparator<Integer> comp = (o1, o2) -> Math.abs(o1 - mediana) - Math.abs(o2 - mediana);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        Collections.sort(list, comp);
        Integer[] rez = list.toArray(new Integer[list.size()]);
        return rez;
    }

}
