package Java_Collections.level_3.lesson_15.space;

/**
 * @author Ivan Korol on 5/31/2018
 */
public class Bomb extends BaseObject {
    public Bomb(double x, double y) {
        super(x, y, 1);
    }

    public void move() {
        setY(getY()+1);
    }

    public void draw(Canvas canvas) {
        canvas.setPoint(getX(), getY(), 'B');
    }
}
