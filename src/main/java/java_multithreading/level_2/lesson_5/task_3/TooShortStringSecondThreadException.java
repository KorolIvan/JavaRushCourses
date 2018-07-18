package java_multithreading.level_2.lesson_5.task_3;

/**
 * @author Ivan Korol on 7/18/2018
 */
public class TooShortStringSecondThreadException extends RuntimeException {
    public TooShortStringSecondThreadException(StringIndexOutOfBoundsException e) {
        super(e);
    }
}

