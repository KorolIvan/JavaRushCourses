package Java_Collections.level_6.lesson_4.task_1;

import java.util.List;

/**
 * @author Ivan Korol on 6/14/2018
 */
public class Controller {
    private static Model model = new Model();

    public List<String> onDataListShow() {
        return model.getStringDataList();
    }
}
