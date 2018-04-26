package java_core.level_19.lesson_11.task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author Ivan Korol on 4/26/2018
 */
public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("text.txt"));

        while (reader.ready()) {
            String line = reader.readLine();
            String nameStr = line.replaceAll("[\\w]", "").trim();
            String[] digitalParts = line.substring(nameStr.length()).trim().split(" ");
            int day = Integer.parseInt(digitalParts[0]);
            int month = Integer.parseInt(digitalParts[1]);
            int year = Integer.parseInt(digitalParts[2]);
            Date date = new GregorianCalendar(year, month-1, day).getTime();

            PEOPLE.add(new Person(nameStr, date));
        }
        reader.close();
//        for (Person person: PEOPLE) {
//            System.out.println(person.getName() + person.getBirthday());
//        }
    }
}
