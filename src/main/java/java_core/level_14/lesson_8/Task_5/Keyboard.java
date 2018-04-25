package java_core.level_14.lesson_8.Task_5;

import level_14.lesson_8.Task_5.CompItem;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Keyboard implements CompItem{
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
