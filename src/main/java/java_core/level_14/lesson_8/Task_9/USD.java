package java_core.level_14.lesson_8.Task_9;

import level_14.lesson_8.Task_9.Money;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class USD extends Money{

    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
