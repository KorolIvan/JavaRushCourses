package level_15.lesson_2;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_3 {
    public static void main(String[] args) {
        new LuxuriousCar().printlnDesire();
        new CheapCar().printlnDesire();
        new Ferrari().printlnDesire();
        new Lanos().printlnDesire();
    }

    public static class Ferrari extends LuxuriousCar{
        public void printlnDesire() {
            //add your code here
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar{
        public void printlnDesire() {
            //add your code here
            System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
        }
    }

    public static class LuxuriousCar{
        void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }
    }

    public static class CheapCar {
        void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }
}
