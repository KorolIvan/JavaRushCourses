package level_14.lesson_8.Task_13;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public  class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){

    }
    public static Singleton getInstance(){
        return instance;
    }

}
