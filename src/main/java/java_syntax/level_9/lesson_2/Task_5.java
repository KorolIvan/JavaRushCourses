package level_9.lesson_2;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_5 {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        int i = Thread.currentThread().getStackTrace().length;//напишите тут ваш код
        System.out.println(i);
        return i;
    }
}
