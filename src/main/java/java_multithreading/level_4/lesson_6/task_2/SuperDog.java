package java_multithreading.level_4.lesson_6.task_2;

import java.text.SimpleDateFormat;

/**
 * @author Ivan Korol on 7/27/2018
 */
public abstract class SuperDog {
    protected String getSuperQuotes() {
        //some logic here
        return " *** ";
    }

    protected SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy EEE");
}
