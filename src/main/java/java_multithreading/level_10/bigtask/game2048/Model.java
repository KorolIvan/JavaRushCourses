package java_multithreading.level_10.bigtask.game2048;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan Korol on 9/11/2018
 */
public class Model {
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
    protected int score;
    protected int maxTile;

    public Model() {
        resetGameTiles();
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

    private List<Tile> getEmptyTales() {
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
        List<Tile> emptyTiles = getEmptyTales();
        if(emptyTiles.size() != 0) {
            emptyTiles.get((int) (Math.random() * emptyTiles.size())).value = ((Math.random() < 0.9) ? 2 : 4);
        }
    }

    private void compressTiles(Tile[] tiles) {
        for (int i = 1; i < tiles.length; i++) {
            for (int j = 1; j < tiles.length; j++) {
                if (tiles[j - 1].isEmpty() && !tiles[j].isEmpty()) {
                    tiles[j - 1] = tiles[j];
                    tiles[j] = new Tile();
                }
            }
        }
    }

    private void mergeTiles(Tile[] tiles) {
        for (int i = 1; i < tiles.length; i++) {
            if ((tiles[i - 1].value == tiles[i].value) && !tiles[i - 1].isEmpty() && !tiles[i].isEmpty()) {
                tiles[i - 1].value *= 2;
                score += tiles[i - 1].value;
                maxTile = maxTile > tiles[i - 1].value ? maxTile : tiles[i - 1].value;
                tiles[i] = new Tile();
                compressTiles(tiles);
            }
        }
    }
}
