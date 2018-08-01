package java_multithreading.level_5.lesson_16.refactoring.car;

/**
 * @author Ivan Korol on 8/1/2018
 */
public class Truck extends Car {
    private static final int MAX_TRUCK_SPEED = 80;

    public Truck(int numberOfPassengers) {
        super(Car.TRUCK, numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {
        return MAX_TRUCK_SPEED;
    }
}
