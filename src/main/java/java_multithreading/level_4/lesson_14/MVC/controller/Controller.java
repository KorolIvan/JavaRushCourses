package java_multithreading.level_4.lesson_14.MVC.controller;

import java_multithreading.level_4.lesson_14.MVC.model.Model;
import java_multithreading.level_4.lesson_14.MVC.view.UsersView;

/**
 * @author Ivan Korol on 7/27/2018
 */
public class Controller {
    private Model model;
    private UsersView usersView;

    public void onShowAllUsers() {
        model.loadUsers();
        usersView.refresh(model.getModelData());
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setUsersView(UsersView usersView) {
        this.usersView = usersView;
    }

    public void onShowAllDeletedUsers() {
        model.loadDeletedUsers();
        usersView.refresh(model.getModelData());
    }
}
