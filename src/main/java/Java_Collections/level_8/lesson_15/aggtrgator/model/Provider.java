package Java_Collections.level_8.lesson_15.aggtrgator.model;

import Java_Collections.level_8.lesson_15.aggtrgator.vo.Vacancy;

import java.util.List;

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

    public List<Vacancy> getJavaVacancies(String searchString){
        return null;
    }

}
