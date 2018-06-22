package Java_Collections.level_9.lesson_9.task_6;

/**
 * @author Ivan Korol on 6/22/2018
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(isOneEditAway("", "")); // true
        System.out.println(isOneEditAway("", "m")); //true
        System.out.println(isOneEditAway("m", "")); //true
        //System.out.println(isOneEditAway("m", null));
        System.out.println("------");
        System.out.println(isOneEditAway("mama", "ramas")); //false
        System.out.println(isOneEditAway("mamas", "rama")); //false
        System.out.println(isOneEditAway("rama", "raa")); //true
        System.out.println(isOneEditAway("mama", "dama")); //true
        System.out.println(isOneEditAway("ama", "mama"));  //true
        System.out.println(isOneEditAway("123", "1453")); //false
        System.out.println(isOneEditAway("32", "332")); //true
        System.out.println(isOneEditAway("2", "33")); //false
        System.out.println(isOneEditAway("am", "mak"));//false
        System.out.println(isOneEditAway("123", "1023"));//true

    }

    //todo
    public static boolean isOneEditAway(String first, String second) {
        int length = first.length() - second.length();
        String longest;
        String shortest;

        if (first == null || second == null || Math.abs(length) > 1)
            return false;

        if (first.equals(second)) return true;

        int mistakesAllowed = 1;
        if (first.length() == second.length()) {
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    mistakesAllowed--;
                    if (mistakesAllowed < 0) {
                        return false;
                    }
                }
            }
        } else {
            if (length == 1) {
                longest = first;
                shortest = second;
            } else {
                longest = second;
                shortest = first;
            }
            if (longest.contains(shortest))
                return true;
            for (int i = 0; i < longest.length(); i++) {
                if (shortest.charAt(i) != longest.charAt(i)) {
                    mistakesAllowed--;
                    longest = longest.substring(i+1);
                    i--;
                    if (mistakesAllowed < 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
