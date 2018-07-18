package java_multithreading.level_2.task_3;

/**
 * @author Ivan Korol on 7/18/2018
 */
public class TooShortStringFirstThreadException extends RuntimeException {
    public TooShortStringFirstThreadException(StringIndexOutOfBoundsException e) {
        super(e);
    }
}
