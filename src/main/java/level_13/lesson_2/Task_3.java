package level_13.lesson_2;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_3 {
    public static void main(String[] args) throws Exception {
        print(new Beer());
        print(new Cola());
    }

    private static void print(Drink drink) {
        System.out.println(drink.getClass().getSimpleName());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class Beer implements Drink{
        @Override
        public boolean isAlcoholic() {
            return true;
        }
    }

    public static class Cola implements Drink{
        @Override
        public boolean isAlcoholic() {
            return false;
        }
    }
}
