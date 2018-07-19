package java_multithreading.level_3.lesson_4.task_3;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ivan Korol on 7/19/2018
 */
public class ViewMock {
    private static final Map FAKE_TASKS_CRITERIA = new HashMap();
    private static final Map FAKE_NAMES_CRITERIA = new HashMap();

    public static Map getFakeTasksCriteria() {
        return FAKE_TASKS_CRITERIA;
    }

    public static Map getFakeNamesCriteria() {
        return FAKE_NAMES_CRITERIA;
    }
}
