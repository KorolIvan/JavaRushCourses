package java_multithreading.level_4.lesson_14.MVC.model.service;

import java_multithreading.level_4.lesson_14.MVC.bean.User;

import java.util.List;

/**
 * @author Ivan Korol on 7/27/2018
 */
public interface UserService {
    public User deleteUser(long id);

    public User createOrUpdateUser(String name, long id, int level);

    public List<User> getUsersByName(String name);

    public List<User> getAllDeletedUsers();

    public List<User> getUsersBetweenLevels(int fromLevel, int toLevel);

    List<User> filterOnlyActiveUsers(List<User> allUsers);

    User getUsersById(long userId);
}
