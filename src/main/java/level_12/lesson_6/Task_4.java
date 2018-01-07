package level_12.lesson_6;

public class Task_4 {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        @Override
        public String getName() {
            return "Cow";
        }
    }
}
