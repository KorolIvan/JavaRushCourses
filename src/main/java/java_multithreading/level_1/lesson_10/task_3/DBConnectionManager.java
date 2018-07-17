package java_multithreading.level_1.lesson_10.task_3;

/**
 * @author Ivan Korol on 7/17/2018
 */
public class DBConnectionManager {
    public FakeConnection getFakeConnection() {
        return new FakeConnection();
    }
}
