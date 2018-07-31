package java_multithreading.level_5.lesson_7.task_3;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

/**
 * @author Ivan Korol on 7/31/2018
 */
public abstract class SocketTask<T> implements CancellableTask<T> {
    private Socket socket;

    protected synchronized void setSocket(Socket socket) {
        this.socket = socket;
    }

    public synchronized void cancel() {
        //close all resources here
        try {
            socket.close();
        } catch (IOException e) {

        }
    }

    public RunnableFuture<T> newTask() {
        return new FutureTask<T>(this) {
            public boolean cancel(boolean mayInterruptIfRunning) {
                //close all resources here by using proper SocketTask method
                //call super-class method in finally block
                try {
                    socket.close();
                } catch (IOException e) {

                }finally {
                    super.cancel(mayInterruptIfRunning);
                }
                return true;
            }
        };
    }
}
