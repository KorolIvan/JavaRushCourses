package java_core.level_14.lesson_8.Task_2;

import level_14.lesson_8.Task_2.BubblyWine;
import level_14.lesson_8.Task_2.Drink;
import level_14.lesson_8.Task_2.Wine;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        return new Wine();
    }

    public static Wine getWine() {
        return new Wine();
    }

    public static Wine getBubblyWine() {
        return new BubblyWine();
    }
}
