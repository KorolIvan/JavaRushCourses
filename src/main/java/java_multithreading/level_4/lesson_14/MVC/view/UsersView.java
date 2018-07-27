package java_multithreading.level_4.lesson_14.MVC.view;

import java_multithreading.level_4.lesson_14.MVC.bean.User;
import java_multithreading.level_4.lesson_14.MVC.controller.Controller;
import java_multithreading.level_4.lesson_14.MVC.model.ModelData;

/**
 * @author Ivan Korol on 7/27/2018
 */
public class UsersView implements View {
    private Controller controller;
    @Override
    public void refresh(ModelData modelData) {
        System.out.println("All users:");
        for(User user: modelData.getUsers()) {
            System.out.println("\t" + user.toString());
        }
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventShowAllUsers() {
        controller.onShowAllUsers();
    }

}
