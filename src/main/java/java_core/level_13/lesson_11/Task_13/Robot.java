package java_core.level_13.lesson_11.Task_13;

import level_13.lesson_11.Task_13.AbstractRobot;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Robot extends AbstractRobot{
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
