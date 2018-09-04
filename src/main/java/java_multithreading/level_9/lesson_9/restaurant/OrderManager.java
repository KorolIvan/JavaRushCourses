package java_multithreading.level_9.lesson_9.restaurant;

import java_multithreading.level_9.lesson_9.restaurant.kitchen.Cook;
import java_multithreading.level_9.lesson_9.restaurant.kitchen.Order;
import java_multithreading.level_9.lesson_9.restaurant.statistic.StatisticManager;

import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Ivan Korol on 9/3/2018
 */
public class OrderManager implements Observer {
    private LinkedBlockingQueue<Order> orderQueue = new LinkedBlockingQueue<>();

    public OrderManager() {
        Thread threadDaemon  = new Thread() {
            Set<Cook> cooks = StatisticManager.getInstance().getCooks();
            @Override
            public void run() {

                while (true) {
                    try {


                    //if (!orderQueue.isEmpty()) {
                        for (final Cook cook : cooks) {
                            if (!cook.isBusy() && !orderQueue.isEmpty()) {
                                final Order order = orderQueue.poll();
                                Thread th = new Thread() {
                                    @Override
                                    public void run() {
                                        if (order != null)
                                            cook.startCookingOrder(order);
                                    }
                                };
                                th.start();
                            }
                            if (orderQueue.isEmpty())
                                break;
                        }
                    Thread.sleep(10);
                    } catch (InterruptedException e) {}
                }
            }
        };
        threadDaemon .setDaemon(true);
        threadDaemon .start();
    }

    @Override
    public void update(Observable o, Object arg) {
        Order order = (Order) arg;
        orderQueue.add(order);
    }
}
