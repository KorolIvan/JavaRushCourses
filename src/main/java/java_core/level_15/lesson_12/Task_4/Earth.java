package java_core.level_15.lesson_12.Task_4;


/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Earth implements Planet{
    private static Earth instance;

    private Earth() {

    }

    public static synchronized Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}
