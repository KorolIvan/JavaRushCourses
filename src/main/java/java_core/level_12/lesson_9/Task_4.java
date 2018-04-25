package java_core.level_12.lesson_9;

public class Task_4 {
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


    public class Human implements Run, Swim{

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Duck implements Run, Swim, Fly{

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

    public class Penguin implements Swim, Run{

        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public class Airplane implements Run, Fly{

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
