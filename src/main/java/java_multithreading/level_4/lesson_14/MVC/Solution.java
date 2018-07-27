package java_multithreading.level_4.lesson_14.MVC;

import java_multithreading.level_4.lesson_14.MVC.controller.Controller;
import java_multithreading.level_4.lesson_14.MVC.model.FakeModel;
import java_multithreading.level_4.lesson_14.MVC.model.Model;
import java_multithreading.level_4.lesson_14.MVC.view.UsersView;

/**
 * @author Ivan Korol on 7/27/2018
 */
public class Solution {
    public static void main(String[] args) {
        Model model = new FakeModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();
    }
}
