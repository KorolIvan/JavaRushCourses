package java_multithreading.level_5.lesson_9.task_1;

/**
 * @author Ivan Korol on 7/31/2018
 */
public class Solution extends Thread {

    public Solution() {
        setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                if (e instanceof Error)
                    System.out.println("Нельзя дальше работать");
                else if (e instanceof Exception)
                    System.out.println("Надо обработать");
                else if (e instanceof Throwable)
                    System.out.println("Поживем - увидим");
                else
                    System.out.println("ХЗ");
            }
        });
    }

    public static void main(String[] args) {
    }
}
