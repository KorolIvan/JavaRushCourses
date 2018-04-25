package java_core.level_15.lesson_12;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_6 {
    static {
        init();
    }

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("non-static block");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";


    public Task_6() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        level_15.lesson_12.Task_6 s = new level_15.lesson_12.Task_6();
    }

    public static void printAllFields(level_15.lesson_12.Task_6 obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);

    }
}
