package Java_Collections.level_10.lesson_10.Sokoban.controller;

import Java_Collections.level_10.lesson_10.Sokoban.model.Direction;
import Java_Collections.level_10.lesson_10.Sokoban.model.GameObjects;
import Java_Collections.level_10.lesson_10.Sokoban.model.Model;
import Java_Collections.level_10.lesson_10.Sokoban.view.View;

/**
 * @author Ivan Korol on 7/17/2018
 */
public class Controller implements EventListener {
    private View view;
    private Model model;

    public Controller() {
        view = new View(this);
        model = new Model();
        view.init();
        view.setEventListener(this);
        model.restart();
        model.setEventListener(this);
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
    }

    public GameObjects getGameObjects() {
        return model.getGameObjects();
    }

    @Override
    public void move(Direction direction) {
        model.move(direction);
        view.update();
    }

    @Override
    public void restart() {
        model.restart();
        view.update();
    }

    @Override
    public void startNextLevel() {
        model.startNextLevel();
        view.update();
    }

    @Override
    public void levelCompleted(int level) {
        view.completed(level);
    }
}
