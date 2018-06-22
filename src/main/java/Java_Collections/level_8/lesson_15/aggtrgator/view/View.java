package Java_Collections.level_8.lesson_15.aggtrgator.view;

import Java_Collections.level_8.lesson_15.aggtrgator.Controller;
import Java_Collections.level_8.lesson_15.aggtrgator.vo.Vacancy;

import java.util.List;

/**
 * @author Ivan Korol on 6/22/2018
 */
public interface View {
    void update(List<Vacancy> vacancies);
    void setController(Controller controller);
}
