package java_multithreading.level_1.lesson_10.task_3;

/**
 * @author Ivan Korol on 7/17/2018
 */
public class FakeConnection implements AutoCloseable {
    public FakeConnection() {
        System.out.println("Creating database connection...");
    }

    public void unsupportedOperation() {
        System.out.println("Operation is not supported yet!");
        throw new RuntimeException("UnsupportedOperation!");
    }

    public void usefulOperation() {
        System.out.println("Executing useful operation.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing database connection...");
    }
}
