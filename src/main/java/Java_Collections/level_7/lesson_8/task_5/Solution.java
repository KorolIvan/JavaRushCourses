package Java_Collections.level_7.lesson_8.task_5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class Solution {
    public static void main(String[] args) {
        List<Game> games = new ArrayList<>();
        games.add(new Football());
        games.add(new Basketball());
        games.add(new Tennis());

        for(Game game : games) {
            game.run();
            System.out.println("---------------------------------------------");
        }
    }
}

