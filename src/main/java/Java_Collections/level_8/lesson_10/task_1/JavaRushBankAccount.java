package Java_Collections.level_8.lesson_10.task_1;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class JavaRushBankAccount {
    private String ownerName;

    @LongPositive
    private long amount;

    public JavaRushBankAccount(String ownerName) {
        this.ownerName = ownerName;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
