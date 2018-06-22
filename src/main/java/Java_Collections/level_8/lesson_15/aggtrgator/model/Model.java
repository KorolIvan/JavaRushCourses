package Java_Collections.level_8.lesson_15.aggtrgator.model;

import Java_Collections.level_8.lesson_15.aggtrgator.view.View;
import Java_Collections.level_8.lesson_15.aggtrgator.vo.Vacancy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan Korol on 6/22/2018
 */
public class Model {
    Provider[] providers;
    View view;

    public Model(View view, Provider... providers) {
        if(view == null || providers == null){
            throw  new IllegalArgumentException();
        }
        if(providers.length == 0) {
            throw new IllegalArgumentException();
        }
        this.view = view;
        this.providers = providers;

    }

    public void selectCity(String city) {
        List<Vacancy> vacancyList = new ArrayList<>();
        for(int i = 0; i < providers.length; i++) {
            vacancyList.addAll(providers[i].getJavaVacancies(city));
        }
        view.update(vacancyList);
    }
}
