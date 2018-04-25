package java_core.level_16.lesson_13;

import static java.lang.String.valueOf;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_3 {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{
        public GenerateThread (){
            super(String.valueOf(++countCreatedThreads));
            this.start();
        }

        @Override
        public void run() {
            if (countCreatedThreads < count) {
                System.out.println(new GenerateThread());
            }
        }

        @Override
        public String toString() {
            return countCreatedThreads + " created";
        }
    }
}
