package level_9.lesson_6;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_3 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            int[] m = new int[2];
            m[8] = 5;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        //напишите тут ваш код
    }
}
