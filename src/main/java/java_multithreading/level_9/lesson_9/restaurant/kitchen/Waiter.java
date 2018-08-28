package java_multithreading.level_9.lesson_9.restaurant.kitchen;

import java_multithreading.level_9.lesson_9.restaurant.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Ivan Korol on 8/28/2018
 */
public class Waiter implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        ConsoleHelper.writeMessage(arg + " was cooked by " + o);
    }
}
