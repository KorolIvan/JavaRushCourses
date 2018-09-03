package java_multithreading.level_9.lesson_9.restaurant;

import java_multithreading.level_9.lesson_9.restaurant.statistic.StatisticManager;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

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

    }

    public void printArchivedVideoSet() {

    }

}
