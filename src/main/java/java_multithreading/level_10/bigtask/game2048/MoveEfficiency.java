package java_multithreading.level_10.bigtask.game2048;

/**
 * @author Ivan Korol on 9/21/2018
 */
public class MoveEfficiency {
    private int numberOfEmptyTiles;
    private int score;
    private Move move;

    public MoveEfficiency(int numberOfEmptyTiles, int score, Move move) {
        this.numberOfEmptyTiles = numberOfEmptyTiles;
        this.score = score;
        this.move = move;
    }

    public Move getMove() {
        return move;
    }
}
