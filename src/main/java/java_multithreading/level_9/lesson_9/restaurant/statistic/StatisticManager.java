package java_multithreading.level_9.lesson_9.restaurant.statistic;

import java_multithreading.level_9.lesson_9.restaurant.statistic.event.EventDataRow;

/**
 * @author Ivan Korol on 8/31/2018
 */
public class StatisticManager {
    private static StatisticManager statisticManager = new StatisticManager();

    public static StatisticManager getInstance() {
        return statisticManager;
    }

    private StatisticManager() {
    }

    public void register(EventDataRow data) {

    }
}
