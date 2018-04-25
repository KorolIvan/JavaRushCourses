package java_core.level_15.lesson_12.Task_12;

import level_15.lesson_12.Task_12.DrinkMaker;

public class LatteMaker extends DrinkMaker{
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void putIngredient() {
        System.out.println("Делаем кофе");
    }

    @Override
    void pour() {
        System.out.println("Заливаем молоком с пенкой");
    }
}
