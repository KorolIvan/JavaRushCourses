package Java_Collections.level_8.lesson_4.task_1;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class VeryComplexClass {
    public void veryComplexMethod() throws Exception {
        InputStream stream = new FileInputStream("qwerty");
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        try {
            new VeryComplexClass().veryComplexMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
