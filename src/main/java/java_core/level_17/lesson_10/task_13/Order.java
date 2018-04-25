package java_core.level_17.lesson_10.task_13;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Order {
    private long time;
    private byte tableNumber;

    public Order(byte tableNumber) {
        time = (long) (Math.random() * 200);
        this.tableNumber = tableNumber;
    }

    public long getTime() {
        return time;
    }

    public byte getTableNumber() {
        return tableNumber;
    }
}
