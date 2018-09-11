package java_multithreading.level_10.lesson_2.task_1;

/**
 * @author Ivan Korol on 9/10/2018
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(convertToDecimalSystem("0x16")); //22
        System.out.println(convertToDecimalSystem("012"));  //10
        System.out.println(convertToDecimalSystem("0b10")); //2
        System.out.println(convertToDecimalSystem("62"));   //62
    }

    public static String convertToDecimalSystem(String s) {
        String result;

        if (s.startsWith("0x")) {
            result = String.valueOf(Integer.parseInt(s.substring(2, s.length()), 16));
        }
        else if (s.startsWith("0b")) {
            result = String.valueOf(Integer.parseInt(s.substring(2, s.length()), 2));
        }
        else if (s.startsWith("0")) {
            result = String.valueOf(Integer.parseInt(s, 8));
        }
        else {
            result = s;
        }

        return result;
    }
}