package java_core.level_17.lesson_4.task_4;

public class OurPresident {
    private static level_17.lesson_4.task_4.OurPresident president;

    static {
        synchronized (level_17.lesson_4.task_4.OurPresident.class) {
            president = new level_17.lesson_4.task_4.OurPresident();
        }
    }

    private OurPresident() {
    }

    public static level_17.lesson_4.task_4.OurPresident getOurPresident() {
        return president;
    }
}
