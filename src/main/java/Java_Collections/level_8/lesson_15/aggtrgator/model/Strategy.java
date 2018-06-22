package Java_Collections.level_8.lesson_15.aggtrgator.model;

import Java_Collections.level_8.lesson_15.aggtrgator.vo.Vacancy;

import java.util.List;

/**
 * @author Ivan Korol on 6/21/2018
 */
public interface Strategy {
    List<Vacancy> getVacancies(String searchString);
}
