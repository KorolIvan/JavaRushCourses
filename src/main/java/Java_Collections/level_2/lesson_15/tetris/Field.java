package Java_Collections.level_2.lesson_15.tetris;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        //Создаем массив, куда будем "рисовать" текущее состояние игры
        int[][] canvas = new int[height][width];

        //Копируем "матрицу поля" в массив
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                canvas[i][j] = matrix[i][j];
            }
        }

        //Копируем фигурку в массив, только непустые клетки
        int left = Tetris.game.getFigure().getX();
        int top = Tetris.game.getFigure().getY();
        int[][] brickMatrix = Tetris.game.getFigure().getMatrix();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (top + i >= height || left + j >= width) continue;
                if (brickMatrix[i][j] == 1)
                    canvas[top + i][left + j] = 2;
            }
        }


        //Выводим "нарисованное" на экран, но начинаем с "границы кадра".
        System.out.println("---------------------------------------------------------------------------\n");

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int index = canvas[i][j];
                if (index == 0)
                    System.out.print(" . ");
                else if (index == 1)
                    System.out.print(" X ");
                else if (index == 2)
                    System.out.print(" X ");
                else
                    System.out.print("???");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
    }

    public void removeFullLines(){
        int[] fullOfOne = new int[width];
        Arrays.fill(fullOfOne, 1);

        List<int[]> result = new ArrayList();

        Arrays.asList(matrix).stream()
                .filter((x) -> !Arrays.equals(x, fullOfOne))
                .forEach(result::add);

        int diference = matrix.length - result.size();

        for (int i = 0; i < diference; i++) {
            result.add(0, new int[width]);
        }

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = result.get(i);
        }
    }

    public Integer getValue(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height)
            return matrix[y][x];
        return null;
    }

    public void setValue(int x, int y, int value) {
        if (x >= 0 && x < width && y >= 0 && y < height)
            matrix[y][x] = value;
    }
}
