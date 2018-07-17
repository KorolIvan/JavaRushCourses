package java_multithreading.level_1.hippodrome;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan Korol on 7/17/2018
 */
public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() {

    }

    public void move() {

    }

    public void print() {

    }

    public static void main(String[] args) {
        List<Horse> list = new ArrayList<>();
        list.add(new Horse("Splash", 3, 0));
        list.add(new Horse("Luzzer", 3, 0));
        list.add(new Horse("Faster", 3, 0));
        game = new Hippodrome(list);
    }
}
