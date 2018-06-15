package Java_Collections.level_6.lesson_8.task_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Ivan Korol on 6/15/2018
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        TreeSet<Character> letters = new TreeSet<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String s = reader.readLine().toLowerCase().replaceAll("[\\p{Punct}, \\p{Space}, \\p{Nd}]", "");
                for(int i = 0; i < s.length(); i++) {
                    letters.add(s.charAt(i));
                }
            }

            Iterator<Character> iterator = letters.iterator();
            int n = letters.size() < 5 ? letters.size() : 5;
            for(int i = 0; i < n; i++) {
                System.out.print((iterator.next()));
            }
        }
    }
}
