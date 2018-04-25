package level_9.lesson_6;

import java.util.ArrayList;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_4 {
    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }

    }
}
