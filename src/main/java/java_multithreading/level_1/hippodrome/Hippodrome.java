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
        for (int i = 0; i < 100; i++) {
            move();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            print();
        }
    }

    public void move() {
        for (Horse h : getHorses()) {
            h.move();
        }
    }

    public void print() {
        for (Horse h : getHorses()) {
            h.print();
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
    }

    public Horse getWinner(){
        Horse winner = getHorses().get(0);
        for(Horse h: getHorses()) {
            if (h.getDistance() >= winner.getDistance()) {
                winner = h;
            }
        }
        return winner;
    }

    public void printWinner(){
        System.out.println(String.format("Winner is %s!", getWinner().getName()));
    }

    public static void main(String[] args) {
        List<Horse> list = new ArrayList<>();
        list.add(new Horse("Splash", 3, 0));
        list.add(new Horse("Luzzer", 3, 0));
        list.add(new Horse("Faster", 3, 0));
        game = new Hippodrome(list);
        game.run();
    }
}
