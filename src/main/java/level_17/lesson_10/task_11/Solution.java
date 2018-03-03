package level_17.lesson_10.task_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * @author by Ivan Korol on 11/8/2017.
 */

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        String name;
        Sex sex;
        Date db;
        Person person;
        int id;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        if (args[0].equals("-c")) {
            name = args[1];
            sex = (args[2].equals("м")) ? Sex.MALE : Sex.FEMALE;
            db = simpleDateFormat.parse(args[3]);
            if(sex == Sex.MALE) {
                person = Person.createMale(name, db);
            } else {
                person = Person.createFemale(name, db);
            }
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
        }
        if (args[0].equals("-u")) {
            id = Integer.parseInt(args[1]);
            name = args[2];
            sex = (args[3].equals("м")) ? Sex.MALE : Sex.FEMALE;
            db = simpleDateFormat.parse(args[4]);
            person = allPeople.get(id);
            person.setName(name);
            person.setSex(sex);
            person.setBirthDay(db);
        }

        if (args[0].equals("-d")) {
            id = Integer.parseInt(args[1]);
            person = allPeople.get(id);
            person.setName(null);
            person.setSex(null);
            person.setBirthDay(null);
        }
        if (args[0].equals("-i")) {
            id = Integer.parseInt(args[1]);
            person = allPeople.get(id);
            String s = (person.getSex() == Sex.MALE) ? "м": "ж";
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            System.out.println(person.getName()+ " " + s + " " + simpleDateFormat1.format(person.getBirthDay()));
        }
    }
}
