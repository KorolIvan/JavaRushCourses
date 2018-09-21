package java_multithreading.level_10.bigtask.game2048;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Ivan Korol on 9/11/2018
 */
public class Model {
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
    protected int score;
    protected int maxTile;
    private Stack<Tile[][]> previousStates = new Stack<>();
    private Stack<Integer> previousScores = new Stack<>();
    private boolean isSaveNeeded;

    public Model() {
        resetGameTiles();
        isSaveNeeded = true;
    }

    protected void resetGameTiles() {
        for(int i = 0; i < FIELD_WIDTH; i++) {
            for(int j = 0; j < FIELD_WIDTH; j++){
                gameTiles[i][j] = new Tile();
            }
        }

        score = 0;
        maxTile = 0;

        addTile();
        addTile();
    }

    private List<Tile> getEmptyTiles() {
        List<Tile> emptyTiles = new ArrayList<>();
        for(int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                Tile tile = gameTiles[i][j];
                if(tile.isEmpty()) {
                    emptyTiles.add(tile);
                }
            }
        }
        return emptyTiles;
    }

    private void addTile() {
        List<Tile> emptyTiles = getEmptyTiles();
        if(emptyTiles.size() != 0) {
            emptyTiles.get((int) (Math.random() * emptyTiles.size())).value = ((Math.random() < 0.9) ? 2 : 4);
        }
    }

    private boolean compressTiles(Tile[] tiles) {
        boolean comparess = false;
        for (int i = 1; i < tiles.length; i++) {
            for (int j = 1; j < tiles.length; j++) {
                if (tiles[j - 1].isEmpty() && !tiles[j].isEmpty()) {
                    comparess = true;
                    tiles[j - 1] = tiles[j];
                    tiles[j] = new Tile();
                }
            }
        }
        return comparess;
    }

    private boolean mergeTiles(Tile[] tiles) {
        boolean marge = false;
        for (int i = 1; i < tiles.length; i++) {
            if ((tiles[i - 1].value == tiles[i].value) && !tiles[i - 1].isEmpty() && !tiles[i].isEmpty()) {
                marge = true;
                tiles[i - 1].value *= 2;
                score += tiles[i - 1].value;
                maxTile = maxTile > tiles[i - 1].value ? maxTile : tiles[i - 1].value;
                tiles[i] = new Tile();
                compressTiles(tiles);
            }
        }
        return marge;
    }

    public void left() {
        int j = 0;
        for(Tile[] gameTile : gameTiles) {
            if(compressTiles(gameTile) | mergeTiles(gameTile)) {
                j++;
            }
        }

        if(j != 0) {
            addTile();
        }
    }

    public void rotate() {
        Tile[][] rotateGameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < FIELD_WIDTH; i++)
        {
            for (int j = 0; j < FIELD_WIDTH; j++)
            {
                rotateGameTiles[j][FIELD_WIDTH-1-i] = gameTiles[i][j];
            }
        }
        gameTiles = rotateGameTiles;
    }

    public void up(){
        rotate();
        rotate();
        rotate();
        left();
        rotate();
    }
    public void right(){
        rotate();
        rotate();
        left();
        rotate();
        rotate();
    }
    public void down(){
        rotate();
        left();
        rotate();
        rotate();
        rotate();
    }

    public boolean canMove() {
        if (!getEmptyTiles().isEmpty())
            return true;
        for (Tile[] gameTile : gameTiles) {
            for (int j = 1; j < gameTiles.length; j++) {
                if (gameTile[j].value == gameTile[j - 1].value)
                    return true;
            }
        }
        for(int j = 0; j < gameTiles.length; j++) {
            for(int i = 1; i < gameTiles.length; i++) {
                if(gameTiles[i][j].value == gameTiles[i-1][j].value)
                    return true;
            }
        }
        return false;
    }

    public Tile[][] getGameTiles() {
        return gameTiles;
    }

    private void saveState(Tile[][] tiles) {
        Tile[][] temp = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                temp[i][j] = new Tile();
            }
        }

        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                temp[i][j].value = tiles[i][j].value;
            }
        }

        previousStates.push(temp);
        previousScores.push(score);
        this.isSaveNeeded = false;
    }

    public void rollback() {
        if(previousStates.isEmpty() | previousScores.isEmpty()){
            return;
        }

        score = previousScores.pop();

        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                gameTiles[i][j].value = previousStates.peek()[i][j].value;
            }
        }
        gameTiles = previousStates.pop();
    }
}
