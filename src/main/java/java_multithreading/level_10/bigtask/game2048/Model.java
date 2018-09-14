package java_multithreading.level_10.bigtask.game2048;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan Korol on 9/11/2018
 */
public class Model {
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];

    public Model() {
        resetGameTiles();
    }

    protected void resetGameTiles() {
        for(int i = 0; i < FIELD_WIDTH; i++) {
            for(int j = 0; j < FIELD_WIDTH; j++){
                gameTiles[i][j] = new Tile();
            }
        }
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
}
