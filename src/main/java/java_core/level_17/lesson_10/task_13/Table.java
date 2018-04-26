package java_core.level_17.lesson_10.task_13;


/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Table {
    private static byte tableNumber;
    private byte number = ++tableNumber;

    public Order getOrder () {
        return new Order(number);
    }
}
