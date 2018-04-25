package java_core.level_12.lesson_12;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_8 {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i) {
        return i * i;
    }

    public static int transformValue(Integer i) {
        return i+i;
    }
}
