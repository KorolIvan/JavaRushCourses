package java_multithreading.level_2.lesson_13.task_3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan Korol on 7/19/2018
 */
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null) {
            return false;
        }

        if (telNumber.matches("^\\+\\d{12}")) {
            return true;
        }

        if (telNumber.matches("^\\+\\d{2}\\(\\d{3}\\)\\d{7}")) {
            return true;
        }

        if (telNumber.matches("^\\+\\d{8}-\\d{2}-\\d{2}")) {
            return true;
        }

        if (telNumber.matches("^\\d{6}-\\d{4}")) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("+380501234567");
        list.add("+38(050)1234567");
        list.add("+38050123-45-67");
        list.add("050123-4567");
        list.add("+38)050(1234567");
        list.add("+38(050)1-23-45-6-7");
        list.add("050ххх4567");
        list.add("050123456");
        list.add("(0)501234567");
        for (String s: list) {
            System.out.println(checkTelNumber(s));
        }
    }
}
