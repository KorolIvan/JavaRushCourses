package java_multithreading.level_9.restaurant;

import java_multithreading.level_9.restaurant.ad.AdvertisementManager;
import java_multithreading.level_9.restaurant.ad.NoVideoAvailableException;
import java_multithreading.level_9.restaurant.kitchen.Order;
import java_multithreading.level_9.restaurant.kitchen.TestOrder;

import java.io.IOException;
import java.util.Observable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ivan Korol on 8/27/2018
 */
public class Tablet extends Observable {
    private final int number;
    private static Logger logger = Logger.getLogger(Tablet.class.getName());
    private LinkedBlockingQueue<Order> queue;

    public Tablet(int number) {
        this.number = number;
    }

    public Order createOrder() {
        Order order = null;
        AdvertisementManager advertisementManager = null;
        try {
            order = new Order(this);
            advertisementManager = new AdvertisementManager(order.getTotalCookingTime()*60);
            if(!order.isEmpty()) {
                ConsoleHelper.writeMessage(order.toString());
                setChanged();
                notifyObservers(order);
                advertisementManager.processVideos();
            }

        } catch (IOException e) {
            logger.log(Level.SEVERE,"Console is unavailable.");
            return null;
        } catch (NoVideoAvailableException e) {
            logger.log(Level.INFO, "No video is available for the order " + order);
        }
        return order;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }

    public void createTestOrder() {
        TestOrder order = null;
        try {
            order = new TestOrder(this);
            processOrder(order);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Console is unavailable.");
        }
    }
    private void processOrder(Order order) {
        if (!order.isEmpty()) {
            ConsoleHelper.writeMessage(order.toString());
            try {
                new AdvertisementManager(order.getTotalCookingTime()*60).processVideos();
            } catch (NoVideoAvailableException e) {
                logger.log(Level.INFO, "No video is available for the order " + order);
            }
            setChanged();
            notifyObservers(order);
        }
    }

    public void setQueue(LinkedBlockingQueue<Order> queue) {
        this.queue = queue;
    }

    public int getNumber() {
        return number;
    }
}
