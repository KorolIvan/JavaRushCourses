package Java_Collections.level_8.lesson_15.aggtrgator.model;

import Java_Collections.level_8.lesson_15.aggtrgator.vo.Vacancy;

import java.util.Collections;
import java.util.List;

/**
 * @author Ivan Korol on 6/22/2018
 */
public class HHStrategy implements Strategy {
    private static final String URL_FORMAT = "http://hh.ua/search/vacancy?text=java+%s&page=%d";
    private String city;
    private int page;


    private String getString() {
        return String.format(URL_FORMAT, city, page);
    }

    public void setString(String city, int page){
        this.city = city;
        this.page = page;
    }

    @Override
    public List<Vacancy> getVacancies(String searchString) {
        return Collections.emptyList();
    }
}
