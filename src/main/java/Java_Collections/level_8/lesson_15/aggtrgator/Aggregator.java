package Java_Collections.level_8.lesson_15.aggtrgator;


import Java_Collections.level_8.lesson_15.aggtrgator.model.HHStrategy;
import Java_Collections.level_8.lesson_15.aggtrgator.model.Provider;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class Aggregator {
    public static void main(String[] args) {

        Provider provider = new Provider(new HHStrategy());
        Controller controller = new Controller(provider);
        controller.scan();
    }
}
