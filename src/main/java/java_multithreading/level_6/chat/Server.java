package java_multithreading.level_6.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Ivan Korol on 8/6/2018
 */
public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();
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

    public static void sendBroadcastMessage(Message message){
        try{
            for (Map.Entry<String, Connection> pair : connectionMap.entrySet())
                pair.getValue().send(message);
        }catch(IOException e){
            System.out.println("Сообщение не отправлено");
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        private Handler(Socket socket) {
            this.socket = socket;
        }

    }
}
