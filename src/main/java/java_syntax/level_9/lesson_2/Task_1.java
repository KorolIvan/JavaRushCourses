package level_9.lesson_2;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_1 {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        return Thread.currentThread().getStackTrace();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method2() {
        method3();
        return Thread.currentThread().getStackTrace();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method3() {
        method4();
        return Thread.currentThread().getStackTrace();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method4() {
        method5();
        return Thread.currentThread().getStackTrace();
        //напишите тут ваш код
    }

    public static StackTraceElement[] method5() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement el:
             elements) {
            System.out.println(el);
        }
        return Thread.currentThread().getStackTrace();//напишите тут ваш код
    }
}
