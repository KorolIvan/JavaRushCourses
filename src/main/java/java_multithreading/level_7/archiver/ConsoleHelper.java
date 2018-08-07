package java_multithreading.level_7.archiver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return (String) reader.readLine();
    }

    public static int readInt() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

}
