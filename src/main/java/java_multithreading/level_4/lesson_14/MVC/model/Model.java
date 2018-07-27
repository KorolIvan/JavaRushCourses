package java_multithreading.level_4.lesson_14.MVC.model;

/**
 * @author Ivan Korol on 7/27/2018
 */
public interface Model {
    ModelData getModelData();
    void loadUsers();
    void loadDeletedUsers();
}
