package java_core.level_14.lesson_8.Task_13;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public  class Singleton {
    private static level_14.lesson_8.Task_13.Singleton instance = new level_14.lesson_8.Task_13.Singleton();

    private Singleton(){

    }
    public static level_14.lesson_8.Task_13.Singleton getInstance(){
        return instance;
    }

}
