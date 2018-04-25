package level_9.lesson_2;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_2 {

    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method2() {
        method3();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method3() {
        method4();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method4() {
        method5();
        return Thread.currentThread().getStackTrace()[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method5() {

        return Thread.currentThread().getStackTrace()[2].getMethodName();
        //напишите тут ваш код
    }
}
