package Java_Collections.level_8.lesson_15.aggtrgator.view;

import Java_Collections.level_8.lesson_15.aggtrgator.Controller;
import Java_Collections.level_8.lesson_15.aggtrgator.vo.Vacancy;

import java.util.List;

/**
 * @author Ivan Korol on 6/22/2018
 */
public class HtmlView implements View {
    private Controller controller;
    private final String filePath = "./src/" + this.getClass().getPackage().getName().replaceAll("\\.", "/") + "/vacancies.html";

    @Override
    public void update(List<Vacancy> vacancies) {
        System.out.println(vacancies.size());
        System.out.println(filePath);
        try{
            String newFile = getUpdatedFileContent(vacancies);
            updateFile(newFile);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void userCitySelectEmulationMethod() {
        controller.onCitySelect("Odessa");
    }

    private String getUpdatedFileContent(List<Vacancy> vacancies) {
        return null;
    }

    private void updateFile(String s) {

    }
}
