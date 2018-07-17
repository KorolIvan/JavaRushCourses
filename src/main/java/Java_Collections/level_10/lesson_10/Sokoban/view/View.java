package Java_Collections.level_10.lesson_10.Sokoban.view;

import Java_Collections.level_10.lesson_10.Sokoban.controller.Controller;
import Java_Collections.level_10.lesson_10.Sokoban.controller.EventListener;

import javax.swing.*;

/**
 * @author Ivan Korol on 7/17/2018
 */
public class View extends JFrame {
    private Controller controller;
    private Field field;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void init() {
        field = new Field(this);
        add(field);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Сокобан");
        setVisible(true);
    }

    public void setEventListener(EventListener eventListener) {
        field.setEventListener(eventListener);
    }
}
