package java_core.level_15.lesson_12.Task_12;

import level_15.lesson_12.Task_12.DrinkMaker;

public class TeaMaker extends DrinkMaker{
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    @Override
    void pour() {
        System.out.println("Заливаем кипятком");
    }
}
