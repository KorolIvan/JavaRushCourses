package Java_Collections.level_2.lesson_15.tetris;

/**
 * @author Ivan Korol on 5/23/2018
 */
public class Field {
    private int width;
    private int height;
    private int[][] matrix;

    public Field(int x, int y) {
        this.width = x;
        this.height = y;
        matrix = new int[y][x];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void print() {

    }

    public void removeFullLines(){

    }

    public Integer getValue(int x, int y) {

        return null;
    }

    public void setValue(int x, int y, int value) {

    }
}
