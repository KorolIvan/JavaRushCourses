package Java_Collections.level_8.lesson_15.aggtrgator.view;

import Java_Collections.level_8.lesson_15.aggtrgator.Controller;
import Java_Collections.level_8.lesson_15.aggtrgator.vo.Vacancy;

import java.util.List;

/**
 * @author Ivan Korol on 6/22/2018
 */
public class HtmlView implements View {
    private Controller controller;

    @Override
    public void update(List<Vacancy> vacancies) {
        System.out.println(vacancies.size());
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void userCitySelectEmulationMethod() {
        controller.onCitySelect("Odessa");
    }
}
