package java_multithreading.level_3.lesson_13.Arkanoid;

import java.util.ArrayList;
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
    static Arkanoid game;
    private boolean isGameOver = false;

    public static void main(String[] args) {

    }

    public Arkanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void run() {

    }

    public void move() {
        if(stand != null && ball != null) {
            stand.move();
            ball.move();
        }
    }

    public void draw(Canvas canvas) {
        //draw bricks
        for (Brick brick : bricks) {
            brick.draw(canvas);
        }

        //draw ball
        ball.draw(canvas);

        //draw stand
        stand.draw(canvas);
    }

    public void checkBricksBump() {
        for (Brick brick : new ArrayList<Brick>(bricks)) {
            if (ball.isIntersec(brick)) {
                double angle = Math.random() * 360;
                ball.setDirection(angle);

                bricks.remove(brick);
            }
        }
    }

    /*
     * Проверяем столкновение с подставкой.
     * Если столкновение было - шарик отлетает в случайном направлении  вверх 80..100 градусов.
     */
    public void checkStandBump() {
        if (ball.isIntersec(stand)) {
            double angle = 90 + 20 * (Math.random() - 0.5);
            ball.setDirection(angle);
        }
    }

    /*
     * Проверяем - не улетел ли шарик через дно.
     * Если да - игра окончена (isGameOver = true)
     */
    public void checkEndGame() {
        if (ball.getY() > height)
            isGameOver = true;
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
