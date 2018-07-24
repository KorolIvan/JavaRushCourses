package java_multithreading.level_3.lesson_13.Arkanoid;

/**
 * @author Ivan Korol on 7/23/2018
 */
public class Stand extends BaseObject {
    private double speed;
    private double direction;
    public Stand(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {
        double dx = speed*direction;
        super.setX(super.getX()+dx);
    }

    public void moveLeft() {
        direction = -1;
    }

    public void moveRight() {
        direction = 1;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }
}
