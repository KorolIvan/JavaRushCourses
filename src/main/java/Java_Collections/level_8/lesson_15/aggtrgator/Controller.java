package Java_Collections.level_8.lesson_15.aggtrgator;

import Java_Collections.level_8.lesson_15.aggtrgator.model.Model;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class Controller {
    Model model;

    public Controller(Model model) {
        if(model == null) {
            throw  new IllegalArgumentException();
        }
        this.model = model;
    }

    public void onCitySelect(String cityName) {
        model.selectCity(cityName);
    }
}
