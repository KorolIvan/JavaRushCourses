package java_multithreading.level_4.lesson_14.MVC.model;

import java_multithreading.level_4.lesson_14.MVC.bean.User;
import java_multithreading.level_4.lesson_14.MVC.model.service.UserService;
import java_multithreading.level_4.lesson_14.MVC.model.service.UserServiceImpl;

import java.util.List;

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
        modelData.setDisplayDeletedUserList(false);
        modelData.setUsers(userService.getUsersBetweenLevels(1, 100));
    }

    public void loadDeletedUsers() {
        List<User> users = userService.getAllDeletedUsers();
        modelData.setUsers(users);
        modelData.setDisplayDeletedUserList(true);
    }

    @Override
    public void loadUserById(long userId) {
        User user = userService.getUsersById(userId);
        modelData.setActiveUser(user);
    }
}
