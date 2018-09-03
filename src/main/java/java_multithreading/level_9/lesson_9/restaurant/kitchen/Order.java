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
    private boolean empty;

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

    public boolean isEmpty() {
        return dishes.isEmpty();
    }

    public int getTotalCookingTime() {
        int totalTime = 0;
        for(int i = 0; i < dishes.size(); i++) {
            totalTime = dishes.get(i).getDuration() + totalTime;
        }
        return totalTime;
    }

    protected void initDishes() throws IOException {
        this.dishes = ConsoleHelper.getAllDishesForOrder();
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public Tablet getTablet() {
        return tablet;
    }
}
