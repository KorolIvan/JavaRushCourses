package java_multithreading.level_4.lesson_14.MVC.view;

import java_multithreading.level_4.lesson_14.MVC.controller.Controller;
import java_multithreading.level_4.lesson_14.MVC.model.ModelData;

/**
 * @author Ivan Korol on 7/30/2018
 */
public class EditUserView implements View {
    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("User to be edited:");
        System.out.println("\t" + modelData.getActiveUser().toString());
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventUserDeleted(long id) {
        controller.onUserDelete(id);
    }
}
