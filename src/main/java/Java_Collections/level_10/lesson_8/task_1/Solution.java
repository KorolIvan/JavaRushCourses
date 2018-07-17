package Java_Collections.level_10.lesson_8.task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;

/**
 * @author Ivan Korol on 7/17/2018
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        getSite(new URL("http://javarush.ru/social.html"));
    }

    public static void getSite(URL url) {
        try {
            Socket socket = new Socket(url.getHost(), url.getDefaultPort());

            OutputStream outputStream = socket.getOutputStream();
            String request = "GET " + url.getFile() + "HTTP/1.1\r\n";
            request += "Host: " + url.getHost() + "\r\n\r\n";
            outputStream.write(request.getBytes());
            outputStream.flush();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String responseLine;

            while ((responseLine = bufferedReader.readLine()) != null) {
                System.out.println(responseLine);
            }
            bufferedReader.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
