package level_15.lesson_12;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_10 {
    public static void main(String[] args) {
        System.out.println(new Hrivna().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    //add your code below - добавь код ниже
    public static class Hrivna extends Money {
        public double amount = 123d;

        @Override
        public Double getAmount() {
            return amount;
        }

        public Hrivna getMoney() {
            return this;
        }
    }
}
