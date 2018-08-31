package java_multithreading.level_9.lesson_9.restaurant.kitchen;

import java_multithreading.level_9.lesson_9.restaurant.ConsoleHelper;
import java_multithreading.level_9.lesson_9.restaurant.statistic.StatisticManager;
import java_multithreading.level_9.lesson_9.restaurant.statistic.event.CookedOrderEventDataRow;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Ivan Korol on 8/27/2018
 */
public class Cook extends Observable implements Observer {
    private final String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }

    @Override
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
}
