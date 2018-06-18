package Java_Collections.level_7.lesson_8.task_5;

/**
 * @author Ivan Korol on 6/18/2018
 */
public abstract class Game {
    public abstract void prepareForTheGame();

    public abstract void playGame();

    public abstract void congratulateWinner();

    public void run(){
        prepareForTheGame();
        playGame();
        congratulateWinner();
    }

}
