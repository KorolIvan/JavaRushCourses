package level_7.lesson_12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_4 {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list  = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String st = null;
        for(int i = 0; i < 2; i++){
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (String s:
             result) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for(int i = 0; i< list.size(); i++){
            list.add(i, list.get(i++));

        }
        //напишите тут ваш код

        return list;
    }
}
