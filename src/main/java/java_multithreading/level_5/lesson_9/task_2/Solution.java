package java_multithreading.level_5.lesson_9.task_2;

import java.util.TimerTask;

/**
 * @author Ivan Korol on 7/31/2018
 */
public class Solution extends TimerTask {
    protected TimerTask original;
    protected final Thread.UncaughtExceptionHandler handler;

    public Solution(TimerTask original) {
        if (original == null) {
            throw new NullPointerException();
        }
        this.original = original;
        this.handler = new Thread.UncaughtExceptionHandler()
        {
            @Override
            public void uncaughtException(Thread t, Throwable e)
            {
                String stars = t.getName().replaceAll(".", "*");
                String newMessage = e.getMessage().replace(t.getName(), stars);
                e = new Exception(newMessage, e);
                System.out.println(e.getMessage());
                t.setName(stars);
            }
        };    //init handler here
    }

    public void run() {
        try {
            original.run();
        } catch (Throwable cause) {
            Thread currentThread = Thread.currentThread();
            handler.uncaughtException(currentThread, new Exception("Blah " + currentThread.getName() + " blah-blah-blah", cause));
        }
    }

    public long scheduledExecutionTime() {
        return original.scheduledExecutionTime();
    }

    public boolean cancel() {
        return original.cancel();
    }

    public static void main(String[] args) {
    }
}
