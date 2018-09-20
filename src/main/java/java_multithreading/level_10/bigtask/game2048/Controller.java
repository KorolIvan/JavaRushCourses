package java_multithreading.level_10.bigtask.game2048;

import java.awt.event.KeyAdapter;

/**
 * @author Ivan Korol on 9/11/2018
 */
public class Controller extends KeyAdapter {
    private Model model;
    private View view;

    public Tile[][] getGameTiles() {
        return model.getGameTiles();
    }

    public int getScore() {
        return model.score;
    }
}
