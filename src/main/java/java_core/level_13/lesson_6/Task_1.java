package java_core.level_13.lesson_6;

public class Task_1 {
    public static void main(String[] args) {

    }
    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Eatable {
        void eaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    public class Cat implements Movable, Eatable, Eat{
        @Override
        public void move() {

        }

        @Override
        public void eaten() {

        }

        @Override
        public void eat() {

        }
    }

    public class Dog implements Movable, Eat{
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Mouse implements Movable, Eatable{
        @Override
        public void move() {

        }

        @Override
        public void eaten() {

        }
    }
}
