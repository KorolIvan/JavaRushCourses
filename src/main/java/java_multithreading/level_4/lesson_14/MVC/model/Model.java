package java_multithreading.level_4.lesson_14.MVC.model;

/**
 * @author Ivan Korol on 7/27/2018
 */
public interface Model {
    ModelData getModelData();
    void loadUsers();
    void loadDeletedUsers();
    void loadUserById(long userId);
    void deleteUserById(long id);
    void changeUserData(String name, long id, int level);
}
