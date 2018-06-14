package Java_Collections.level_6.lesson_4.task_1;

import java.util.List;

/**
 * @author Ivan Korol on 6/14/2018
 */
public class Model {
    private static Service service = new Service();
    public List<String> getStringDataList() {
        return  service.getData();
    }
}
