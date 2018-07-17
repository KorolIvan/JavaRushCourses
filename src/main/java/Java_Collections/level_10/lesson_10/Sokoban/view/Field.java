package Java_Collections.level_10.lesson_10.Sokoban.view;

import Java_Collections.level_10.lesson_10.Sokoban.controller.EventListener;
import Java_Collections.level_10.lesson_10.Sokoban.model.GameObject;

import javax.swing.*;
import java.awt.*;
import java.util.Set;

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
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 500, 500);
        Set<GameObject> gameObjectSet = view.getGameObjects().getAll();
        for (GameObject gameObject : gameObjectSet) {
            gameObject.draw(g);
        }
    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }
}
