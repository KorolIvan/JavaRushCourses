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

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= width; j++) {
                if (matrix[i][j] == 0) {
                    System.out.print(".");
                }else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

    public void removeFullLines(){

    }

    public Integer getValue(int x, int y) {

        return null;
    }

    public void setValue(int x, int y, int value) {

    }
}
