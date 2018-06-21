package Java_Collections.level_8.lesson_15.aggtrgator.model;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class Provider {

    Strategy strategy;

    public Provider(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
