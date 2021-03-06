package java_multithreading.level_5.lesson_16.refactoring.car;

import java.util.Date;

/**
 * @author Ivan Korol on 7/31/2018
 */
public abstract class Car {
    static public final int TRUCK = 0;
    static public final int SEDAN = 1;
    static public final int CABRIOLET = 2;

    double fuel;

    public double summerFuelConsumption;
    public double winterFuelConsumption;
    public double winterWarmingUp;

    private int type;

    private boolean driverAvailable;
    private int numberOfPassengers;

     protected Car(int type, int numberOfPassengers) {
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }

    public static Car create(int type, int numberOfPassengers) {
         Car car = null;
         switch (type) {
             case 0:
                 car =  new Truck(numberOfPassengers);
                 break;
             case 1:
                 car = new Sedan(numberOfPassengers);
                 break;
             case 2:
                 car = new Cabriolet(numberOfPassengers);
                 break;
         }
         return car;
    }

    private boolean canPassengersBeTransferred() {
         if(isDriverAvailable() && fuel > 0) {
             return true;
         }
         return false;
    }

    public void fill(double numberOfLiters) throws Exception {
        if (numberOfLiters < 0){
            throw new Exception();
        }
        fuel += numberOfLiters;
    }

    public boolean isSummer(Date date, Date summerStart, Date summerEnd) {
         return (date.after(summerStart) && date.before(summerEnd));
    }

    public double getTripConsumption(Date date, int length, Date SummerStart, Date SummerEnd) {
        if (!isSummer(date, SummerStart, SummerEnd)) {
           return getWinterConsumption(length);
        } else {
            return getSummerConsumption(length);
        }
    }

    public double getWinterConsumption(int length) {
        return ((length * winterFuelConsumption) + winterWarmingUp);
    }

    public double getSummerConsumption(int length) {
         return (length * summerFuelConsumption);
    }

    public int getNumberOfPassengersCanBeTransferred() {
        if (canPassengersBeTransferred()) {
            return numberOfPassengers;
        }
        return 0;
    }

    public boolean isDriverAvailable() {
        return driverAvailable;
    }

    public void setDriverAvailable(boolean driverAvailable) {
        this.driverAvailable = driverAvailable;
    }

    public void startMoving() {
        if (numberOfPassengers > 0) {
            fastenPassengersBelts();
        }
        fastenDriverBelt();
    }

    public void fastenPassengersBelts() {
    }

    public void fastenDriverBelt() {
    }

    public abstract int getMaxSpeed();

}
