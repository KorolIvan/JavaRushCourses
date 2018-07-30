package java_multithreading.level_4.lesson_14.MVC;

import java_multithreading.level_4.lesson_14.MVC.controller.Controller;
import java_multithreading.level_4.lesson_14.MVC.model.MainModel;
import java_multithreading.level_4.lesson_14.MVC.model.Model;
import java_multithreading.level_4.lesson_14.MVC.view.EditUserView;
import java_multithreading.level_4.lesson_14.MVC.view.UsersView;

/**
 * @author Ivan Korol on 7/27/2018
 */
public class Solution {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();
        EditUserView editUserView = new EditUserView();

        editUserView.setController(controller);
        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);
        usersView.fireEventShowDeletedUsers();
    }
}
