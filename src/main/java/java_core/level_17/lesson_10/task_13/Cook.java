package java_core.level_17.lesson_10.task_13;

import level_17.lesson_10.task_13.Dishes;
import level_17.lesson_10.task_13.Manager;
import level_17.lesson_10.task_13.Order;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Cook implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        boolean needToWait;
        while (continueWorking || needToCookOrders()) {
            try {
                synchronized (this) {
                    needToWait = !needToCookOrders();
                    if (!needToWait) {
                        cooking();
                    }
                }
                if (continueWorking && needToWait) {
                    System.out.println("Повар отдыхает");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    private boolean needToCookOrders() {
        return !Manager.getInstance().getOrderQueue().isEmpty();
    }

    private void cooking() throws InterruptedException {
        Manager manager = Manager.getInstance();
        Order order = manager.getOrderQueue().poll();      // повар берет заказ из очереди
        System.out.println(String.format("Заказ будет готовиться %d мс для стола №%d", order.getTime(), order.getTableNumber()));
        Thread.sleep(order.getTime());     // готовим блюдо
        Dishes dishes = new Dishes(order.getTableNumber());//  это готовое блюдо
        manager.getDishesQueue().add(dishes);
        System.out.println(String.format("Заказ для стола №%d готов", dishes.getTableNumber()));
    }
}
