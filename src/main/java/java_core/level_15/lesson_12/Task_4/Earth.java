package java_core.level_15.lesson_12.Task_4;

import level_15.lesson_12.Task_4.Planet;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Earth implements Planet{
    private static level_15.lesson_12.Task_4.Earth instance;

    private Earth() {

    }

    public static synchronized level_15.lesson_12.Task_4.Earth getInstance() {
        if (instance == null) {
            instance = new level_15.lesson_12.Task_4.Earth();
        }
        return instance;
    }
}
