package java_multithreading.level_9.lesson_9.task_5;

/**
 * @author Ivan Korol on 8/27/2018
 */
public abstract class AbstractLogger implements Logger {
    int level;
    Logger next;

    public AbstractLogger(int level) {
        this.level = level;
    }

    @Override
    public void inform(String message, int level) {
        if (this.level <= level) {
            info(message);
        }
        if (next != null) {
            next.inform(message, level);
        }
    }

    @Override
    public void setNext(Logger next) {
        this.next = next;
    }

}
