package Java_Collections.level_10.lesson_10.Sokoban.controller;

import Java_Collections.level_10.lesson_10.Sokoban.model.Direction;

/**
 * @author Ivan Korol on 7/17/2018
 */
public interface EventListener {
    void move(Direction direction);

    void restart();

    void startNextLevel();

    void levelCompleted(int level);
}
