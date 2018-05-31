package Java_Collections.level_3.lesson_15.space;

/**
 * @author Ivan Korol on 5/31/2018
 */
public abstract class BaseObject {
    private double x;
    private double y;
    private double radius;
    private boolean isAlive;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.isAlive = true;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void draw() {

    }

    public void move() {

    }

    public void die() {
        isAlive = false;
    }

    public boolean isIntersect(BaseObject o) {
        double dx = x - o.x;
        double dy = y - o.y;
        double distance = Math.sqrt(dx*dx+dy*dy);
        double distance1 = Math.max(radius, o.radius);
        return distance<=distance1;
    }
}
