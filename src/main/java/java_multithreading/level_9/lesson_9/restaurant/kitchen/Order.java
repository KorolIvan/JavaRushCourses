package java_multithreading.level_9.lesson_9.restaurant.kitchen;

import java_multithreading.level_9.lesson_9.restaurant.Tablet;

import java.util.List;

/**
 * @author Ivan Korol on 8/27/2018
 */
public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) {
        this.tablet = tablet;
    }
}
