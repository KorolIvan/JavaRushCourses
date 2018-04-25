package level_8.lessons_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_10 {
    public static void main(String[] args) throws IOException{
        Map<String, Integer> month = new HashMap<String, Integer>();
        month.put("January", 1);
        month.put("February", 2);
        month.put("March", 3);
        month.put("April", 4);
        month.put("May", 5);
        month.put("June", 6);
        month.put("July", 7);
        month.put("August", 8);
        month.put("September", 9);
        month.put("October", 10);
        month.put("November", 11);
        month.put("December", 12);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String mon = reader.readLine();

        System.out.println(mon + " is " + month.get(mon) + " month");
    }
}
