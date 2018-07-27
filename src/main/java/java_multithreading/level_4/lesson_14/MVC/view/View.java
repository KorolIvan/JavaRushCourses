package java_multithreading.level_4.lesson_14.MVC.view;

import java_multithreading.level_4.lesson_14.MVC.controller.Controller;
import java_multithreading.level_4.lesson_14.MVC.model.ModelData;

/**
 * @author Ivan Korol on 7/27/2018
 */
public interface View {
    void refresh(ModelData modelData);
    void setController(Controller controller);
}
