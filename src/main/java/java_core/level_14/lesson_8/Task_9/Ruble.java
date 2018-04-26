package java_core.level_14.lesson_8.Task_9;


/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Ruble extends Money{

    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
