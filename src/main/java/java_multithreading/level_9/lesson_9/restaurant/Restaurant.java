package java_multithreading.level_9.lesson_9.restaurant;

/**
 * @author Ivan Korol on 8/27/2018
 */
public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet = new Tablet(5);
        for(int i = 0; i < 4; i++) {
            tablet.createOrder();
        }
    }
}
