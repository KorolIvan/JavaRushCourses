package level_15.lesson_9;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_5 {
    public static Cat cat;
    static {
        cat = new Cat();
        cat.name = "name";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }

    public static class Cat {
        public String name;
    }
}
