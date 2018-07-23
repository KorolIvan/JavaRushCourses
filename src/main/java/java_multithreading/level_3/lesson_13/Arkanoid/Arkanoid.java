package java_multithreading.level_3.lesson_13.Arkanoid;

import java.util.List;

/**
 * @author Ivan Korol on 7/23/2018
 */
public class Arkanoid {
    private int width;
    private int height;
    private Stand stand;
    private Ball ball;
    private List<Brick> bricks;

    public static void main(String[] args) {

    }

    public Arkanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }
}
