package java_core.level_16.lesson_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        //create and run thread
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        //read a string
        reader.readLine();
        stopwatch.interrupt();
        //close streams
        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            try {
                while (!interrupted()) {
                    seconds++;
                    Thread.sleep(1000);
                    if(interrupted()){
                        System.out.println(seconds);
                    }
                }
                //add your code here - добавьте код тут
            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
