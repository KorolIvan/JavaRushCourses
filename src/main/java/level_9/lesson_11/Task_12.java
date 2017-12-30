package level_9.lesson_11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task_12 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        for (String a: array){
            if (isNumber(a)) {
                integers.add(Integer.parseInt(a));
            }
            else strings.add(a);
        }

        Collections.sort(integers);
        Collections.reverse(integers);
        Collections.sort(strings);

        isGreaterThan("a", "b"); //не нужное барахло

        for(int i=0, indexNums=0, indexWords=0; i<array.length;i++){
            if (isNumber(array[i])) {
                array[i] = Integer.toString(integers.get(indexNums));
                indexNums++; }
            else {
                array[i] = strings.get(indexWords);
                indexWords++;
            }
        }
        //напишите тут ваш код
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
