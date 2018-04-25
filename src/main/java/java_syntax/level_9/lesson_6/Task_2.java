package level_9.lesson_6;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_2 {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        }catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}
