package Java_Collections.level_10.lesson_10.Sokoban.controller;

import Java_Collections.level_10.lesson_10.Sokoban.model.Direction;
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
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
    }

    @Override
    public void move(Direction direction) {

    }

    @Override
    public void restart() {

    }

    @Override
    public void startNextLevel() {

    }

    @Override
    public void levelCompleted(int level) {

    }
}
