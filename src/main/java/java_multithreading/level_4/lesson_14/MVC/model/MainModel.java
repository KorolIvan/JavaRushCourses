package java_multithreading.level_4.lesson_14.MVC.model;

import java_multithreading.level_4.lesson_14.MVC.model.service.UserService;
import java_multithreading.level_4.lesson_14.MVC.model.service.UserServiceImpl;

/**
 * @author Ivan Korol on 7/27/2018
 */
public class MainModel implements Model {
    private UserService userService = new UserServiceImpl();
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setUsers(userService.getUsersBetweenLevels(1, 100));
    }
}
