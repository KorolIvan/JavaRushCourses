package java_multithreading.level_5.lesson_16.refactoring.human;

/**
 * @author Ivan Korol on 8/1/2018
 */
public class BloodGroup {
    private final int code;

    private BloodGroup(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static BloodGroup first() {
        return new BloodGroup(1);
    }

    public static BloodGroup second() {
        return new BloodGroup(2);
    }

    public static BloodGroup third() {
        return new BloodGroup(3);
    }

    public static BloodGroup fourth() {
        return new BloodGroup(4);
    }
}
