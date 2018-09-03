package java_multithreading.level_9.lesson_9.restaurant.statistic;

import java_multithreading.level_9.lesson_9.restaurant.kitchen.Cook;
import java_multithreading.level_9.lesson_9.restaurant.statistic.event.EventDataRow;
import java_multithreading.level_9.lesson_9.restaurant.statistic.event.EventType;

import java.util.*;

/**
 * @author Ivan Korol on 8/31/2018
 */
public class StatisticManager {
    private static StatisticManager statisticManager = new StatisticManager();
    private StatisticStorage statisticStorage = new StatisticStorage();
    private Set<Cook> cooks = new HashSet<>();

    public static StatisticManager getInstance() {
        return statisticManager;
    }

    private StatisticManager() {
    }

    public void register(EventDataRow data) {
        statisticStorage.put(data);
    }

    private class StatisticStorage {
        private Map<EventType, List<EventDataRow>> storage = new HashMap<EventType, List<EventDataRow>>();

        private StatisticStorage() {
            for(EventType type: EventType.values()) {
                storage.put(type, new ArrayList<EventDataRow>());
            }
        }

        private void put(EventDataRow data) {
            List<EventDataRow> eventDataRows = storage.get(data.getType());
            eventDataRows.add(data);
            storage.put(data.getType(), eventDataRows);
        }

    }

    public void register(Cook cook) {
        cooks.add(cook);
    }
}
