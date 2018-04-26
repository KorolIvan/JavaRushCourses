package java_core.level_15.lesson_12.Task_4;


/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Moon implements Planet{
    private static Moon instance;

    private Moon(){

    }

    public static synchronized Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }
}
