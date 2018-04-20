package level_19.lesson_3.task_5;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @author Ivan Korol on 4/20/2018
 */
public class Solution {
    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            Person person = null;
            if(fileScanner.hasNext()) {
                String[] parts = fileScanner.nextLine().split(" ");
                String firstName = parts[1];
                String middleName = parts[2];
                String lastName = parts[0];

                Calendar birthDate = new GregorianCalendar(Integer.parseInt(parts[5]), Integer.parseInt(parts[4])-1, Integer.parseInt(parts[3]));
                person = new Person(firstName, middleName, lastName, birthDate.getTime());
            }
            return person;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
