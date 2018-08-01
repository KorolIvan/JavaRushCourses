package java_multithreading.level_5.lesson_16.refactoring.car;

/**
 * @author Ivan Korol on 8/1/2018
 */
public class Cabriolet extends Car {
    private static final int MAX_CABRIOLET_SPEED = 90;

    public Cabriolet(int numberOfPassengers) {
        super(Car.CABRIOLET, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        return MAX_CABRIOLET_SPEED;
    }
}
