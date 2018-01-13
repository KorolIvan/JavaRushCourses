package level_13.lesson_2;

public class Task_9 {
    public static void main(String[] args) {

    }
    interface Movable{
        Double speed();

    }
    interface Flyable extends Movable{
        Double speed(Flyable flyable);
    }
}
