package Java_Collections.level_10.lesson_10.Sokoban.controller;

import Java_Collections.level_10.lesson_10.Sokoban.model.Model;
import Java_Collections.level_10.lesson_10.Sokoban.view.View;

/**
 * @author Ivan Korol on 7/17/2018
 */
public class Controller {
    private View view;
    private Model model;

    public Controller() {
        view = new View(this);
        model = new Model();
    }

    public static void main(String[] args) {

    }
}
