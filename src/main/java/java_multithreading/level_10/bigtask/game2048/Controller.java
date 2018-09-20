package java_multithreading.level_10.bigtask.game2048;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author Ivan Korol on 9/11/2018
 */
public class Controller extends KeyAdapter {
    private Model model;
    private View view;
    private static final int WINNING_TILE = 2048;

    public Controller(Model model) {
        this.model = model;
        this.view = new View(this);
    }

    public void resetGame() {
        model.score = 0;
        view.isGameWon = false;
        view.isGameLost = false;
        model.resetGameTiles();
    }

    public void keyPressed(KeyEvent event) {
        if(event.getKeyCode() == KeyEvent.VK_ESCAPE) {
            resetGame();
        }
        if(!model.canMove()) {
            view.isGameLost = true;
        }
        if(!view.isGameLost && !view.isGameWon) {
            switch (event.getKeyCode()) {
                case KeyEvent.VK_UP:
                    model.up();
                    break;
                case KeyEvent.VK_DOWN:
                    model.down();
                    break;
                case KeyEvent.VK_LEFT:
                    model.left();
                    break;
                case KeyEvent.VK_RIGHT:
                    model.right();
                    break;
            }
        }
        if(model.maxTile == WINNING_TILE) {
            view.isGameWon = true;
        }
        view.repaint();
    }

    public Tile[][] getGameTiles() {
        return model.getGameTiles();
    }

    public int getScore() {
        return model.score;
    }
}
