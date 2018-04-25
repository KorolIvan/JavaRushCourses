package java_core.level_15.lesson_12.Task_4;

import level_15.lesson_12.Task_4.Planet;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Sun implements Planet{
    private static level_15.lesson_12.Task_4.Sun instance;

    private Sun() {

    }

    public static synchronized level_15.lesson_12.Task_4.Sun getInstance() {
        if (instance == null) {
            instance = new level_15.lesson_12.Task_4.Sun();
        }
        return instance;
    }
}
