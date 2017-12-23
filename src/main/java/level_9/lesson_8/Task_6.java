package level_9.lesson_8;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Task_6 {
    public static void main(String[] args) {
    }

    static class MyException extends IOException{
    }

    static class MyException2 extends FileNotFoundException{
    }

    static class MyException3 extends NumberFormatException{
    }

    static class MyException4 extends ArithmeticException{
    }
}
