package java_multithreading.level_2.lesson_5.task_1;

/**
 * @author Ivan Korol on 7/18/2018
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if(string == null || string.isEmpty()) {
            throw new TooShortStringException();
        }
        String[] s = string.split(" ");
        if (s.length < 5) {
            throw new TooShortStringException();
        }

        return s[1] + " " + s[2] + " " + s[3] + " " + s[4];
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
