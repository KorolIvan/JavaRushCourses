package java_core.level_14.lesson_8;


import java.util.ArrayList;
import java.util.List;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_11 {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        }catch (Exception e){
            exceptions.add(e);
            exceptions.add(new NumberFormatException());
            exceptions.add(new NullPointerException());
            exceptions.add(new IllegalArgumentException());
            exceptions.add(new ArrayStoreException());
            exceptions.add(new ClassCastException());
            exceptions.add(new ArrayIndexOutOfBoundsException());
            exceptions.add(new ArithmeticException());
            exceptions.add(new IndexOutOfBoundsException());
            exceptions.add(new RuntimeException());
        }

        //напишите тут ваш код

    }
}
