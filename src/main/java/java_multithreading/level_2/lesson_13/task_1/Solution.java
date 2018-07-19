package java_multithreading.level_2.lesson_13.task_1;

import java.util.StringTokenizer;

/**
 * @author Ivan Korol on 7/19/2018
 */
public class Solution {
    public static void main(String[] args) {
        String[] s = getTokens("level22.lesson13.task01", ".");
        for (String ss: s) {
            System.out.println(ss);
        }
    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        String[] result = new String[st.countTokens()];

        for (int i=0; st.hasMoreElements();i++) {
            result[i] = st.nextToken();
        }

        return result;
    }
}
