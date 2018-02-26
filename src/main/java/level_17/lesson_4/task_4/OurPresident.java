package level_17.lesson_4.task_4;

public class OurPresident {
    private static OurPresident president;

    static {
        synchronized (OurPresident.class) {
            president = new OurPresident();
        }
    }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
