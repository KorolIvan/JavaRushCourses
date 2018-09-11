package java_multithreading.level_10.lesson_8.task_3;

/**
 * @author Ivan Korol on 9/11/2018
 */
public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
    }
}
