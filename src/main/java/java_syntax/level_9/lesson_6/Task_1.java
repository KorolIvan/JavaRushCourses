package level_9.lesson_6;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            int a = 42 / 0;
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
        //напишите тут ваш код
    }
}
