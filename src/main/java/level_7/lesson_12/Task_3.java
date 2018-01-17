package level_7.lesson_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() %2 == 0)
                listUpperCase.add(s + " " + s );
            else
                listUpperCase.add(s + " " + s + " " + s);
        }

        for (int i = 0; i < listUpperCase.size(); i++) {
            System.out.println(listUpperCase.get(i));
        }
    }
}
