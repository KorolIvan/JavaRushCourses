package level_13.lesson_2;

public class Task_5 {
    public static void main(String[] args) throws Exception {

        System.out.println(Dream.HOBBIE.toString());
        System.out.println(new Hobbie().toString());

    }

    interface Desire {
    }

    interface Dream {
        public static Hobbie HOBBIE = new Hobbie();
    }

    static class Hobbie  implements Dream, Desire{
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
