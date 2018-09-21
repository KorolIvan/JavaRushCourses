package java_multithreading.level_9.restaurant.kitchen;

import java.util.Arrays;

/**
 * @author Ivan Korol on 8/27/2018
 */
public enum Dish {
    Fish(25),
    Steak(30),
    Soup(15),
    Juice(5),
    Water(3);

    private int duration;

    Dish(int duration) {
        this.duration = duration;
    }

    Dish() {
    }

    public static String allDishesToString() {
        if(values().length == 0) {
            return "";
        }

        return Arrays.toString(values()).substring(1, Arrays.toString(values()).length()-1);
    }

    public int getDuration() {
        return duration;
    }
}
