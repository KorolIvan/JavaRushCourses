package java_multithreading.level_9.lesson_9.restaurant.kitchen;

import java_multithreading.level_9.lesson_9.restaurant.ConsoleHelper;
import java_multithreading.level_9.lesson_9.restaurant.Tablet;

import java.io.IOException;
import java.util.List;

/**
 * @author Ivan Korol on 8/27/2018
 */
public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOrder();
    }

    @Override
    public String toString() {
        if (dishes.isEmpty()) {
            return "";
        }
        else {
            return "Your order: " + dishes.toString() +" of "+  tablet.toString();
        }
    }
}
