package Java_Collections.level_3.lesson_15.space;

/**
 * @author Ivan Korol on 5/31/2018
 */
public class SpaceShip extends BaseObject {
    private double dx = 0.0;
    public SpaceShip(double x, double y) {
        super(x, y, 3);
    }

    public void moveLeft() {
        dx = -1;
    }

    public void moveRight() {
        dx = 1;
    }
}
