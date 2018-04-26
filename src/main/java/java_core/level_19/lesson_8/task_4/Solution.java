package java_core.level_19.lesson_8.task_4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Ivan Korol on 4/26/2018
 */
public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String out = outputStream.toString().replaceAll("\\p{Cntrl}", "");
        String[] result = out.split(" ");

        int a = Integer.parseInt(result[0]);
        int b = Integer.parseInt(result[2]);
        int c = 0;
        if(result[1].equals("+")){
            c = a + b;

        }else if (result[1].equals("-")){
            c = a - b;

        }else if(result[1].equals("*")) {
            c = a * b;

        }

        System.setOut(consoleStream);
        System.out.println(out + String.valueOf(c));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 * 6 = ");
        }
    }
}
