package java_multithreading.level_5.lesson_5.task_2;

/**
 * @author Ivan Korol on 7/31/2018
 */
public class Solution {
    public static void main(String[] args) {
        MyThread myThread = new Solution().new MyThread("super secret key");
        myThread.start();
    }

    public class MyThread extends Thread {
        private String secretKey;

        public MyThread(String secretKey) {
            this.secretKey = secretKey;
            setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
            //setDaemon(true);
        }

        @Override
        public void run() {
            throw new NullPointerException("it's an example");
        }

        private class MyUncaughtExceptionHandler implements UncaughtExceptionHandler {

            public MyUncaughtExceptionHandler() {

            }

            @Override
            public void uncaughtException(Thread t, Throwable e) {
                try {
                    Thread.sleep(500);
                    System.out.println(String.format("%s, %s, %s", secretKey , t.getName(), e.getMessage()));
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}