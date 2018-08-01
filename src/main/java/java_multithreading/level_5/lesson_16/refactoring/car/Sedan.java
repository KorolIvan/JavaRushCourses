package java_multithreading.level_5.lesson_16.refactoring.car;

/**
 * @author Ivan Korol on 8/1/2018
 */
public class Sedan extends Car {
    private static final int MAX_SEDAN_SPEED = 120;

    public Sedan(int numberOfPassengers) {
        super(Car.SEDAN, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        return MAX_SEDAN_SPEED;
    }
}
