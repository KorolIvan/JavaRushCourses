package java_multithreading.level_3.lesson_4.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Ivan Korol on 7/19/2018
 */
public class DbMock {
    private static final List<Solution.Task> FAKE_TASKS = new ArrayList<>();
    private static final List<String> FAKE_NAMES = new ArrayList<>();

    public static List<Solution.Task> getFakeTasks(Map criteria) {
        return ViewMock.getFakeTasksCriteria().equals(criteria) ? FAKE_TASKS : null;
    }

    public static List<String> getFakeNames(Map criteria) {
        return ViewMock.getFakeNamesCriteria().equals(criteria) ? FAKE_NAMES : null;
    }
}
