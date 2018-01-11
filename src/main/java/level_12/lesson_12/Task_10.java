package level_12.lesson_12;

public class Task_10 {
    public static void main(String[] args) {

    }

    public class Cat implements Run, Climb{
        @Override
        public void run() {

        }

        @Override
        public void climb() {

        }
    }

    public class Dog implements Run{
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements Fly, Run{
        @Override
        public void run() {

        }

        @Override
        public void fly() {

        }
    }

    public interface Run{
        public void run();
    }

    public interface Climb{
        public void climb();
    }

    public interface Fly{
        public void fly();
    }
}
