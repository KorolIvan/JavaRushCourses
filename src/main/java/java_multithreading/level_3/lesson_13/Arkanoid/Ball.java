package java_multithreading.level_3.lesson_13.Arkanoid;

/**
 * @author Ivan Korol on 7/23/2018
 */
public class Ball extends BaseObject {
    private double speed;
    private double direction;
    private double dx;
    private double dy;
    private boolean isFrozen;

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);
        this.speed = speed;
        this.direction = direction;
        isFrozen = true;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(super.x, super.y, 'O');
    }

    @Override
    public void move() {
        if (!isFrozen) {
            super.setX(super.getX()+dx);
            super.setY(super.getY()+dy);
        }
    }

    public void start() {
        isFrozen = false;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }
}
