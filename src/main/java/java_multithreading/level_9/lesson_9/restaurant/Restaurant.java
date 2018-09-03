package java_multithreading.level_9.lesson_9.restaurant;

import java_multithreading.level_9.lesson_9.restaurant.kitchen.Cook;
import java_multithreading.level_9.lesson_9.restaurant.kitchen.Waiter;
import java_multithreading.level_9.lesson_9.restaurant.statistic.StatisticManager;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan Korol on 8/27/2018
 */
public class Restaurant {
    private static final int ORDER_CREATING_INTERVAL = 100;
    public static void main(String[] args) {
        Cook cook = new Cook("Amigo");
        Cook cook2 = new Cook("Fry");
        List<Tablet> tablets = new ArrayList<>();
        StatisticManager.getInstance().register(cook);
        StatisticManager.getInstance().register(cook2);
        for (int i = 0; i < 5; i++) {
            Tablet tablet = new Tablet(i+1);
            tablet.addObserver(cook);
            tablet.addObserver(cook2);
            tablets.add(tablet);
        }
        Waiter waiter = new Waiter();
        cook.addObserver(waiter);
        cook2.addObserver(waiter);
        Thread thread = new Thread(new RandomOrderGeneratorTask(tablets, ORDER_CREATING_INTERVAL));
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            return;
        }
        thread.interrupt();
        DirectorTablet director = new DirectorTablet();
        director.printAdvertisementProfit();
        director.printCookWorkloading();
        director.printActiveVideoSet();
        director.printArchivedVideoSet();
    }
}
