package level_7.lesson_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        Collections.reverse(list);
        for(int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        //напишите тут ваш код
    }
}
