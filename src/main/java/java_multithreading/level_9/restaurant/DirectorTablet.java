package java_multithreading.level_9.restaurant;

import java_multithreading.level_9.restaurant.ad.Advertisement;
import java_multithreading.level_9.restaurant.ad.StatisticAdvertisementManager;
import java_multithreading.level_9.restaurant.statistic.StatisticManager;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Ivan Korol on 9/3/2018
 */
public class DirectorTablet {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public void printAdvertisementProfit() {
        double total = 0;
        StatisticManager statisticManager = StatisticManager.getInstance();
        for(Map.Entry<Date, Double> pair: statisticManager.getTotalAmountForAdvertisement().entrySet()) {
            double profit = (double) pair.getValue();
            ConsoleHelper.writeMessage(String.format("%s - %.2f", simpleDateFormat.format(pair.getKey()), profit));
            total += profit;
        }
        ConsoleHelper.writeMessage(String.format("Total - %.2f", total));
    }

    public void printCookWorkloading() {
        StatisticManager statisticManager = StatisticManager.getInstance();
        for (Map.Entry<Date, Map<String, Integer>> pair : statisticManager.getCookeerInfo().entrySet()) {
            ConsoleHelper.writeMessage(simpleDateFormat.format(pair.getKey()));
            for (Map.Entry<String, Integer> pair2 : pair.getValue().entrySet()) {
                ConsoleHelper.writeMessage(String.format("%s - %d min", pair2.getKey(), pair2.getValue()));
            }
            ConsoleHelper.writeMessage("");
        }
    }

    public void printActiveVideoSet() {
        if (StatisticAdvertisementManager.getInstance().getActiveVideoSet().isEmpty()) return;
        for (Map.Entry<String, Integer> pair : StatisticAdvertisementManager.getInstance().getActiveVideoSet().entrySet()) {
            ConsoleHelper.writeMessage(String.format("%s - %d", pair.getKey(), pair.getValue()));
        }
    }
    public void printArchivedVideoSet() {
        List<Advertisement> inactiveVideos = StatisticAdvertisementManager.getInstance().getInactiveVideoSet();
        Collections.sort(inactiveVideos, new Comparator<Advertisement>() {
            @Override
            public int compare(Advertisement o1, Advertisement o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        for (Advertisement advertisement : inactiveVideos) {
            ConsoleHelper.writeMessage(advertisement.getName());
        }
    }

}
