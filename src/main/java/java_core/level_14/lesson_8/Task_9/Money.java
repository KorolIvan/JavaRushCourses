package java_core.level_14.lesson_8.Task_9;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public abstract class Money {
    private double amount;
    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }

    public abstract String getCurrencyName();
}
