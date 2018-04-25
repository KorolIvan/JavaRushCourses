package java_core.level_16.lesson_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_9 {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        //add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }

    public static class Read3Strings extends Thread {
        String s = null;
        StringBuilder builder = new StringBuilder();
        @Override
        public void run() {
            for(int i = 0; i < 3; i++){
                try {
                     s = reader.readLine();
                     s += " ";
                     builder.append(s );
                } catch (IOException e) {

                }
            }
        }

        public void printResult() {
            System.out.print(builder + "\n");
        }
    }
}
