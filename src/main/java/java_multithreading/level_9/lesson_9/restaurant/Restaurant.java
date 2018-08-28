package java_multithreading.level_9.lesson_9.restaurant;

import java_multithreading.level_9.lesson_9.restaurant.kitchen.Cook;
import java_multithreading.level_9.lesson_9.restaurant.kitchen.Waiter;

/**
 * @author Ivan Korol on 8/27/2018
 */
public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet = new Tablet(5);
        Cook cook = new Cook("Amigo");
        Waiter waiter = new Waiter();
        cook.addObserver(waiter);
        tablet.addObserver(cook);
        tablet.createOrder();
    }
}
