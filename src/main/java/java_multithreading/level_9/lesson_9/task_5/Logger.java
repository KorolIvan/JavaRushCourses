package java_multithreading.level_9.lesson_9.task_5;

/**
 * @author Ivan Korol on 8/27/2018
 */
public interface Logger {
    void inform(String message, int level);

    void setNext(Logger next);

    void info(String message);
}
