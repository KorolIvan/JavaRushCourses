package Java_Collections.level_8.lesson_15.aggtrgator;

import Java_Collections.level_8.lesson_15.aggtrgator.model.Provider;
import Java_Collections.level_8.lesson_15.aggtrgator.vo.Vacancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class Controller {
    private Provider[] providers;

    public Controller(Provider... providers) {
        if(providers.length==0) {
            throw new IllegalArgumentException();
        }
        this.providers = providers;
    }
    @Override
    public String toString() {
        return "Controller{" +
                "providers=" + Arrays.toString(providers) +
                '}';
    }

    public void scan() {
        List<Vacancy> vacancies = new ArrayList<>();
        for(int i = 0; i < providers.length; i++) {
            vacancies.addAll(providers[i].getJavaVacancies("?"));
        }
        System.out.println(vacancies.size());
    }
}
