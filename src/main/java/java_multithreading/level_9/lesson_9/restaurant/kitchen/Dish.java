package java_multithreading.level_9.lesson_9.restaurant.kitchen;

import java.util.Arrays;

/**
 * @author Ivan Korol on 8/27/2018
 */
public enum Dish {
    Fish,
    Steak,
    Soup,
    Juice,
    Water;

    public static String allDishesToString() {
        if(values().length == 0) {
            return "";
        }

        return Arrays.toString(values()).substring(1, Arrays.toString(values()).length()-1);
    }
}
