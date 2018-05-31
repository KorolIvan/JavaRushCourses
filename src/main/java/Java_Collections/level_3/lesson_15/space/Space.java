package Java_Collections.level_3.lesson_15.space;

import java.util.ArrayList;

/**
 * @author Ivan Korol on 5/31/2018
 */
public class Space {
    private int width;
    private int height;
    private SpaceShip ship;
    private ArrayList<Ufo> ufos = new ArrayList<>();
    private ArrayList<Bomb> bombs = new ArrayList<>();
    private ArrayList<Rocket> rockets = new ArrayList<>();
    public static Space game;

    public Space(int width, int heigth) {
        this.width = width;
        this.height = heigth;
    }


    public static void main(String[] args) {

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public SpaceShip getShip() {
        return ship;
    }

    public void setShip(SpaceShip ship) {
        this.ship = ship;
    }

    public ArrayList<Ufo> getUfos() {
        return ufos;
    }

    public ArrayList<Bomb> getBombs() {
        return bombs;
    }

    public ArrayList<Rocket> getRockets() {
        return rockets;
    }

    public void run() {

    }

    public void draw() {

    }

    public void sleep(int ms) {

    }
}
