package Java_Collections.level_8.lesson_15.aggtrgator.model;

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
}
