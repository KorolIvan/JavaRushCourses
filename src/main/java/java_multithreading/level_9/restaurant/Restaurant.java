package java_multithreading.level_9.restaurant;

import java_multithreading.level_9.restaurant.kitchen.Cook;
import java_multithreading.level_9.restaurant.kitchen.Order;
import java_multithreading.level_9.restaurant.kitchen.Waiter;
import java_multithreading.level_9.restaurant.statistic.StatisticManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Ivan Korol on 8/27/2018
 */
public class Restaurant {
    private static final int ORDER_CREATING_INTERVAL = 100;
    private final static LinkedBlockingQueue<Order> orderQueue = new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Cook cook = new Cook("Amigo");
        cook.setQueue(orderQueue);
        Cook cook2 = new Cook("Fry");
        cook2.setQueue(orderQueue);
        Waiter waiter = new Waiter();
        cook.addObserver(waiter);
        cook2.addObserver(waiter);
        OrderManager orderManager = new OrderManager();
        List<Tablet> tablets = new ArrayList<>();
        StatisticManager.getInstance().register(cook);
        StatisticManager.getInstance().register(cook2);
        for (int i = 0; i < 5; i++) {
            Tablet tablet = new Tablet(i+1);
            tablet.setQueue(orderQueue);
            //tablet.addObserver(orderManager);
            tablets.add(tablet);
        }

        Thread randomOrderGeneratorTaskThread = new Thread(new RandomOrderGeneratorTask(tablets, ORDER_CREATING_INTERVAL));
        Thread thread = new Thread(randomOrderGeneratorTaskThread);
        Thread cookThread1 = new Thread(cook);
        Thread cookThread2 = new Thread(cook2);
        thread.start();
        cookThread1.start();
        cookThread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            return;
        }

        thread.interrupt();
        cookThread1.interrupt();
        cookThread2.interrupt();
        randomOrderGeneratorTaskThread.interrupt();

        DirectorTablet director = new DirectorTablet();
        director.printAdvertisementProfit();
        director.printCookWorkloading();
        director.printActiveVideoSet();
        director.printArchivedVideoSet();
    }
}
