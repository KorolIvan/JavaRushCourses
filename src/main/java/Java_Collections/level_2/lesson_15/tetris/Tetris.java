package Java_Collections.level_2.lesson_15.tetris;

/**
 * @author Ivan Korol on 5/23/2018
 */
public class Tetris {
    private Field field;
    private Figure figure;
    static Tetris game;

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public static void main(String[] args) {
        game = new Tetris();
        game.run();
    }

    public void run() {

    }

    public void step() {

    }
}
