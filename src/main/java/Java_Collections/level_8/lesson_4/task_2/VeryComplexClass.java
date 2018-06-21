package Java_Collections.level_8.lesson_4.task_2;

import java.util.TreeMap;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class VeryComplexClass {
    public void methodThrowsClassCastException() {
        Object o = new Integer(0);
        System.out.println((String) o);
    }

    public void methodThrowsNullPointerException() {
        System.out.println(new TreeMap<String, String>().put(null, null));
    }

    public static void main(String[] args) {
        //new VeryComplexClass().methodThrowsClassCastException();
        new VeryComplexClass().methodThrowsNullPointerException();
    }
}
