package java_multithreading.level_10.bigtask.game2048;

/**
 * @author Ivan Korol on 9/21/2018
 */
public class MoveEfficiency implements Comparable<MoveEfficiency> {
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

    @Override
    public int compareTo(MoveEfficiency o) {
        if (numberOfEmptyTiles != o.numberOfEmptyTiles) {
            return Integer.compare(numberOfEmptyTiles, o.numberOfEmptyTiles);
        } else {
            return Integer.compare(score, o.score);
        }
    }
}
