package java_multithreading.level_5.lesson_7.task_1;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @author Ivan Korol on 7/31/2018
 */
public class Solution extends Thread {
    private static final int BUFFER_SIZE = 2000;    //2000 bytes
    private final Socket socket;
    private final InputStream in;

    public Solution(Socket socket) throws IOException {
        this.socket = socket;
        this.in = socket.getInputStream();
    }

    public void interrupt() {
        //implement logic here
        try {
            socket.close();
        } catch (IOException e) {

        }finally {
            super.interrupt();
        }
    }

    public void run() {
        try {
            byte[] buf = new byte[BUFFER_SIZE];
            while (true) {
                int count = in.read(buf);
                if (count < 0) {
                    break;
                } else {
                    if (count > 0) {
                        //process buffer here
                    }
                }
            }
        } catch (IOException ignored) {}
    }

    public static void main(String[] args) {
    }
}
