package java_multithreading.level_2.task_2;

/**
 * @author Ivan Korol on 7/18/2018
 */
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null || string.isEmpty()) {
            throw new TooShortStringException();
        }
        String[] s = string.split("\t");
        if (s.length < 2) {

            throw new TooShortStringException();

        }
        return s[1];
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }
}
