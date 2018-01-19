package level_15.lesson_2;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_2 {

    static class Goose extends SmallAnimal{
        public String getSize() {
            return "Гусь маленький, " + super.getSize();
        }
    }

    static class Dragon extends BigAnimal{
        public String getSize() {
            return "Дракон большой, " + super.getSize();
        }
    }

    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
}
