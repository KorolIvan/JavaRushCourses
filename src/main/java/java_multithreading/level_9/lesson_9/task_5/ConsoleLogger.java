package java_multithreading.level_9.lesson_9.task_5;

/**
 * @author Ivan Korol on 8/27/2018
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        super(level);
    }

    @Override
    public void info(String message) {
        System.out.println("Logging to console: " + message);
    }
}
