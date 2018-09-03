package java_multithreading.level_9.lesson_9.restaurant.kitchen;

import java_multithreading.level_9.lesson_9.restaurant.ConsoleHelper;
import java_multithreading.level_9.lesson_9.restaurant.statistic.StatisticManager;
import java_multithreading.level_9.lesson_9.restaurant.statistic.event.CookedOrderEventDataRow;

import java.util.Observable;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Ivan Korol on 8/27/2018
 */
public class Cook extends Observable implements Runnable {
    private final String name;
    private boolean busy;
    private LinkedBlockingQueue<Order> queue;

    public void setQueue(LinkedBlockingQueue<Order> queue) {
        this.queue = queue;
    }

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }

    public void update(Observable o, Object arg) {
        if (arg instanceof Order) {
            Order order = (Order) arg;
            ConsoleHelper.writeMessage("Start cooking - " + order + ", cooking time " + order.getTotalCookingTime() + "min");
            StatisticManager.getInstance().register(new CookedOrderEventDataRow(((Order) arg).getTablet().toString(),
                    this.name, ((Order) arg).getTotalCookingTime() ,((Order) arg).getDishes()));
            setChanged();
            notifyObservers(arg);
        }

    }

    public void startCookingOrder(Order order) {
        this.busy = true;
        int orderTime = order.getTotalCookingTime();
        ConsoleHelper.writeMessage("Start cooking - " + order + ", cooking time " + orderTime + "min");
        CookedOrderEventDataRow eventDataRow = new CookedOrderEventDataRow(order.getTablet().toString(), name, orderTime * 60, order.getDishes());
        StatisticManager.getInstance().register(eventDataRow);
        setChanged();
        notifyObservers(order);
        try {
            Thread.sleep(orderTime * 10);
        } catch (InterruptedException e) {
        }
        this.busy = false;
    }

    public boolean isBusy() {return busy;}

    @Override
    public void run() {
        while (true) {
            try {
                startCookingOrder(queue.take());
            }
            catch (InterruptedException e) {}
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                busy = true;
            }
            if (busy && queue.isEmpty()) break;
        }
    }
}
