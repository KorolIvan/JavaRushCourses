package java_multithreading.level_9.restaurant;

import java.util.List;

/**
 * @author Ivan Korol on 9/3/2018
 */
public class RandomOrderGeneratorTask implements Runnable {
    private List<Tablet> tablets;
    private int interval;
    public RandomOrderGeneratorTask(List<Tablet> tablets, int interval) {
        this.interval = interval;
        this.tablets = tablets;
    }
    @Override
    public void run() {
        if (tablets.size() > 0) {
            while (!Thread.currentThread().isInterrupted()) {
                int rnd = (int) (Math.random()*tablets.size());
                Tablet tablet = tablets.get(rnd);
                tablet.createTestOrder();
                try {
                    Thread.sleep(interval);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
}
