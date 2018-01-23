package level_15.lesson_12.Task_4;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Sun implements Planet{
    private static Sun instance;

    private Sun() {

    }

    public static synchronized Sun getInstance() {
        if (instance == null) {
            instance = new Sun();
        }
        return instance;
    }
}
