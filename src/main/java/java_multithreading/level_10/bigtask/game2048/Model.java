package java_multithreading.level_10.bigtask.game2048;

/**
 * @author Ivan Korol on 9/11/2018
 */
public class Model {
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];

    public Model() {
        for(int i = 0; i < FIELD_WIDTH; i++) {
            for(int j = 0; j < FIELD_WIDTH; j++){
                gameTiles[i][j] = new Tile();
            }
        }
    }
}
