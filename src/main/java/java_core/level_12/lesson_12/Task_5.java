package java_core.level_12.lesson_12;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_5 {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }

    public class Duck implements Fly, Run, Swim{

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Penguin implements Run, Swim{

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Toad implements Swim {

        @Override
        public void swim() {

        }
    }
}
