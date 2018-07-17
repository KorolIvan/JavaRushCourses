package Java_Collections.level_10.lesson_10.Sokoban.view;

import Java_Collections.level_10.lesson_10.Sokoban.controller.EventListener;

import javax.swing.*;
import java.awt.*;

/**
 * @author Ivan Korol on 7/17/2018
 */
public class Field extends JPanel {
    private View view;
    private EventListener eventListener;
    public Field(View view) {
        this.view = view;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }
}
