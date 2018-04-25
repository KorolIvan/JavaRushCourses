package java_core.level_12.lesson_12;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_4 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        switch (o.getClass().getSimpleName()){
            case "Cat" : return "Кот";
            case "Tiger" : return "Тигр";
            case "Lion" : return "Лев";
            case "Bull" : return "Бык";
            default: return "хз";
        }

    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
