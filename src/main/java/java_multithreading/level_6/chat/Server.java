package java_multithreading.level_6.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Ivan Korol on 8/6/2018
 */
public class Server {
    public static void main(String[] args) {
        int port = ConsoleHelper.readInt();
        Socket socket;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен");
            while (true) {
                socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                handler.start();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        private Handler(Socket socket) {
            this.socket = socket;
        }

    }
}
