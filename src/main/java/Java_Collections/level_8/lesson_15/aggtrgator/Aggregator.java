package Java_Collections.level_8.lesson_15.aggtrgator;

import Java_Collections.level_8.lesson_15.aggtrgator.model.HHStrategy;
import Java_Collections.level_8.lesson_15.aggtrgator.model.Model;
import Java_Collections.level_8.lesson_15.aggtrgator.model.MoikrugStrategy;
import Java_Collections.level_8.lesson_15.aggtrgator.model.Provider;
import Java_Collections.level_8.lesson_15.aggtrgator.view.HtmlView;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class Aggregator {
    public static void main(String[] args) {
        HtmlView view = new HtmlView();
        Model model = new Model(view, new Provider(new HHStrategy()), new Provider(new MoikrugStrategy()));
        Controller controller = new Controller(model);
        view.setController(controller);
        view.userCitySelectEmulationMethod();
    }
}
