package Java_Collections.level_8.lesson_15.aggtrgator.model;

import Java_Collections.level_8.lesson_15.aggtrgator.vo.Vacancy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
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

    public void setString(String city, int page) {
        this.city = city;
        this.page = page;
    }

    @Override
    public List<Vacancy> getVacancies(String searchString) {
        List<Vacancy> vacancies = new ArrayList<>();
        if (searchString.isEmpty()) {
            return Collections.emptyList();
        }
        int j = 0;
        while (true) {
            try {
                Document doc = getDocument(searchString, j++);
                Elements elements = doc.getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy");
                if (elements.size() > 1) {
                    for (int i = 0; i < elements.size(); i++) {
                        Vacancy vacancy = new Vacancy();

                        String title = elements.get(i).getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-title").text();
                        vacancy.setTitle(title);

                        String salary = elements.get(i).getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-compensation").text();
                        if (salary != null)
                            vacancy.setSalary(salary);
                        else vacancy.setSalary("");

                        String city = elements.get(i).getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-address").text();
                        vacancy.setCity(city);

                        String companyName = elements.get(i).getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-employer").text();
                        vacancy.setCompanyName(companyName);

                        String url = elements.get(i).getElementsByAttributeValue("data-qa", "vacancy-serp__vacancy-title").attr("href");
                        vacancy.setUrl(url);

                        String siteName = "http://hh.ua";
                        vacancy.setSiteName(siteName);
                        vacancies.add(vacancy);
                    }
                } else break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return vacancies;
    }


    protected Document getDocument(String searchString, int page) throws IOException {
        Document doc = null;
        try {
            String url = String.format(URL_FORMAT, searchString, page);
            doc = Jsoup.connect(url).userAgent("Chrome/57.0.2987.133 (jsoup)").referrer("http://hh.ua").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return doc;
    }

}
