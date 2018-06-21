package Java_Collections.level_8.lesson_10.task_4;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static boolean printFullyQualifiedNames(Class c) {
        if(c.isAnnotationPresent(PrepareMyTest.class)) {
            PrepareMyTest myTest = (PrepareMyTest) c.getAnnotation(PrepareMyTest.class);
            String[] names = myTest.fullyQualifiedNames();
            for (String name: names) {
                System.out.println(name);
            }
            return true;
        }
        return false;
    }

    public static boolean printValues(Class c) {
        if(c.isAnnotationPresent(PrepareMyTest.class)) {
            PrepareMyTest myTest = (PrepareMyTest) c.getAnnotation(PrepareMyTest.class);
            Class[] values = myTest.value();
            for (Class val: values) {
                System.out.println(val);
            }
            return true;
        }
        return false;
    }
}
