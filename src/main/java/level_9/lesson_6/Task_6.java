package level_9.lesson_6;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_6 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
    }
}
