package Java_Collections.level_5.lesson_4.task_2;

/**
 * @author Ivan Korol on 6/11/2018
 */
public class GenericStatic {
    public static  <T> T  someStaticMethod(T genericObject) {
        System.out.println(genericObject);
        return genericObject;
    }
}
