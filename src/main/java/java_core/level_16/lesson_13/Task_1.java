package java_core.level_16.lesson_13;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Task_1 {
    static int count = 5;

    public static void main(String[] args) {
        NameOfDifferentThreads tt = new NameOfDifferentThreads();
        tt.start();
        for (int i = 0; i < count; i++) {
            tt.printMsg();
        }
    }

    public static class NameOfDifferentThreads extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }

        public void printMsg() {
            Thread t = null;//присвой переменной t текущую нить
            t = Thread.currentThread();
            String name = t.getName();
            System.out.println("name=" + name);
            //add sleep here - добавь sleep тут
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
