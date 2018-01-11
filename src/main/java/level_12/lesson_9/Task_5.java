package level_12.lesson_9;

public class Task_5 {
    public static void main(String[] args) {

    }

    public interface Run {
        void run();
    }

    public interface Swim {
        void swim();
    }

    public abstract class Human implements Run, Swim {

    }
}
