package java_core.level_19.lesson_11.task_9;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Ivan Korol on 4/27/2018
 */
public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(console);
        int i = 0;
        for (String elements: result.split("\\n")){
            System.out.println(elements);
            if(i ++==1) {
                System.out.println("JavaRush - курсы Java онлайн");
                i=0;
            }
        }

    }


    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
