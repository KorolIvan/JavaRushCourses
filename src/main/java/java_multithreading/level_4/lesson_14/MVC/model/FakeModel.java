package java_multithreading.level_4.lesson_14.MVC.model;

import java_multithreading.level_4.lesson_14.MVC.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan Korol on 7/27/2018
 */
public class FakeModel implements Model {
    private ModelData modelData = new ModelData();
    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("A", 1, 1));
        users.add(new User("B", 2, 1));
        modelData.setUsers(users);
    }

    @Override
    public void loadDeletedUsers() {
       throw new UnsupportedOperationException();
    }
}
