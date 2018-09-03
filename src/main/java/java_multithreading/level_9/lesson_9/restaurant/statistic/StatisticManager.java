package java_multithreading.level_9.lesson_9.restaurant.statistic;

import java_multithreading.level_9.lesson_9.restaurant.kitchen.Cook;
import java_multithreading.level_9.lesson_9.restaurant.statistic.event.CookedOrderEventDataRow;
import java_multithreading.level_9.lesson_9.restaurant.statistic.event.EventDataRow;
import java_multithreading.level_9.lesson_9.restaurant.statistic.event.EventType;
import java_multithreading.level_9.lesson_9.restaurant.statistic.event.VideoSelectedEventDataRow;

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

        private List<EventDataRow> get(EventType eventType) {
            return storage.get(eventType);
        }

    }

    public void register(Cook cook) {
        cooks.add(cook);
    }

    public Map<Date, Double> getTotalAmountForAdvertisement() {
        Map<Date, Double> result = new TreeMap<Date, Double>(Collections.reverseOrder());
        List<EventDataRow> eventDataRowList = statisticStorage.get(EventType.SELECTED_VIDEOS);
        Double amount;
        Date date;
        Calendar calendar;
        for (EventDataRow eventDataRow : eventDataRowList) {
            VideoSelectedEventDataRow adVideo = (VideoSelectedEventDataRow) eventDataRow;
            amount = adVideo.getAmount() * 0.01d;
            calendar = Calendar.getInstance();
            calendar.setTime(adVideo.getDate());
            GregorianCalendar gc = new GregorianCalendar(
                    calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH)
            );
            date = gc.getTime();
            if (result.containsKey(date))
                amount += result.get(date);
            result.put(date, amount);
        }
        return result;
    }

    public Map<Date, Map<String, Integer>> getCookeerInfo() {
        Map<Date, Map<String, Integer>> result = new TreeMap<Date, Map<String, Integer>>(Collections.reverseOrder());
        List<EventDataRow> eventDataRowList = statisticStorage.get(EventType.COOKED_ORDER);
        Date date;
        Calendar calendar;
        String cookName;
        int cookingTimeSeconds;
        for (EventDataRow eventDataRow : eventDataRowList) {
            CookedOrderEventDataRow cookedOrder = (CookedOrderEventDataRow) eventDataRow;
            calendar = Calendar.getInstance();
            calendar.setTime(cookedOrder.getDate());
            GregorianCalendar gc = new GregorianCalendar(
                    calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH),
                    calendar.get(Calendar.DAY_OF_MONTH)
            );
            date = gc.getTime();
            cookName = cookedOrder.getCookName();
            cookingTimeSeconds = cookedOrder.getTime();
            Map<String, Integer> cookTime = new TreeMap<String, Integer>();
            if (result.containsKey(date)) {
                cookTime = result.get(date);
                if (cookTime.containsKey(cookName)) {
                    cookingTimeSeconds += cookTime.get(cookName);
                }
            }
            cookTime.put(cookName, cookingTimeSeconds);
            result.put(date, cookTime);
        }
        return result;
    }
}
