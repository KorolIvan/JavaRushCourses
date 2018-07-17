package Java_Collections.level_10.lesson_10.Sokoban.model;

import Java_Collections.level_10.lesson_10.Sokoban.controller.EventListener;

/**
 * @author Ivan Korol on 7/17/2018
 */
public class Model {
    public static final int FIELD_CELL_SIZE = 20;
    private EventListener eventListener;

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }
}
