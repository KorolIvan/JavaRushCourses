package java_multithreading.level_9.lesson_9.task_5;

/**
 * @author Ivan Korol on 8/27/2018
 */
public class SmsLogger implements Logger {
    int level;
    Logger next;

    public SmsLogger(int level) {
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

    @Override
    public void info(String message) {
        System.out.println("Send sms to CEO: " + message);
    }
}
