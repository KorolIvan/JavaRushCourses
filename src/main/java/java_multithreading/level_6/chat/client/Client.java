package java_multithreading.level_6.chat.client;


import java_multithreading.level_6.chat.Connection;
import java_multithreading.level_6.chat.ConsoleHelper;
import java_multithreading.level_6.chat.Message;
import java_multithreading.level_6.chat.MessageType;

import java.io.IOException;
import java.util.regex.Pattern;

/**
 * @author Ivan Korol on 8/6/2018
 */
public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    protected String getServerAddress() {
        ConsoleHelper.writeMessage("Адрес сервера:");
        String address = ConsoleHelper.readString();
        Pattern pattern = Pattern.compile("^([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.\n" +
                "([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])$");
        if (!address.equalsIgnoreCase("localhost") && !pattern.matcher(address).matches()) {
            ConsoleHelper.writeMessage("Не верно введен адрес сервера");
        }
        return address;
    }

    protected int getServerPort(){
        ConsoleHelper.writeMessage("Введите порт сервера.");
        int port = ConsoleHelper.readInt();

        if (port < 0 || port > 65536) {
            ConsoleHelper.writeMessage("Не верно введен адрес сервера");
        }

        return port;
    }

    protected String getUserName(){
        ConsoleHelper.writeMessage("Введите имя пользователя.");
        String name = ConsoleHelper.readString();

        return name;
    }

    protected boolean shouldSendTextFromConsole() {
        return  true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Сообщение не отправлено.");
            clientConnected = false;
        }
    }

    public void run() {
        SocketThread socketThread = getSocketThread();
        socketThread.setDaemon(true);
        socketThread.start();
        try {
            synchronized (this) {
                this.wait();
            }
        } catch (InterruptedException e) {
            ConsoleHelper.writeMessage("Wait error");
            return;
        }
        if (clientConnected) {
            ConsoleHelper.writeMessage("Соединение установлено. Для выхода наберите команду 'exit'.");
        } else {
            ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");
        }
        while (clientConnected) {
            String s;
            if (!(s = ConsoleHelper.readString()).equals("exit")) {
                if (shouldSendTextFromConsole()) {
                    sendTextMessage(s);
                }
            } else {
                return;
            }
        }
    }

    public class SocketThread extends Thread {

        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName) {
            ConsoleHelper.writeMessage("участник " + userName + " присоединился к чату");
        }

        protected void informAboutDeletingNewUser(String userName) {
            ConsoleHelper.writeMessage("участник " + userName + " покинул чат");
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            Client.this.clientConnected = clientConnected;
            synchronized (Client.this) {
                Client.this.notify();
            }
        }
    }
}
