package Java_Collections.level_8.lesson_15.aggtrgator;


import Java_Collections.level_8.lesson_15.aggtrgator.model.Provider;
import Java_Collections.level_8.lesson_15.aggtrgator.model.Strategy;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class Aggregator {
    public static void main(String[] args) {

        Provider provider = new Provider(new Strategy() {
        });
//        Provider[] arrPro = new Provider[]{provider};
        Controller controller = new Controller(provider);
        System.out.println(controller);
    }
}
