package level_15.lesson_4;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_5 {
    public static void main(String[] args) {
        //add((short) 1, 2f);
        add(1, 2);
        add(2d, 2);
        //add("1",2d);
        add((byte) 1, 2d);
    }

    public static void add(int i, int j) {
        System.out.println("Integer addition");
    }

    public static void add(int i, double j) {
        System.out.println("Integer and double addition");
    }

    public static void add(double i, double j) {
        System.out.println("Double addition");
    }
}
