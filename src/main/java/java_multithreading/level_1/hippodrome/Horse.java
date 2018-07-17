package java_multithreading.level_1.hippodrome;

/**
 * @author Ivan Korol on 7/17/2018
 */
public class Horse {
    private String name;
    private double speed;
    private double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void move() {
       distance+=(speed*(Math.random()*1));
    }

    public void print() {
        int dis = (int)Math.floor(getDistance());
        for(int i = 0; i < dis; i++) {
            System.out.print(".");
        }
        System.out.println(getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
