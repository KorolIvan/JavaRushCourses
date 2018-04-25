package java_core.level_15.lesson_12.Task_12;

public abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient();

    abstract void pour();

    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}
