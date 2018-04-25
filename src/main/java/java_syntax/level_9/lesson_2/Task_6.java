package level_9.lesson_2;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_6 {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement el:
//                elements) {
//
//        }

        System.out.println(elements[2].getClassName() + ": "+ elements[2].getMethodName() + ": " + s);
        //напишите тут ваш код
    }
}
