package java_multithreading.level_4.lesson_14.MVC.controller;

import java_multithreading.level_4.lesson_14.MVC.model.Model;

/**
 * @author Ivan Korol on 7/27/2018
 */
public class Controller {
    private Model model;

    public void onShowAllUsers() {
        model.loadUsers();
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
