package Java_Collections.level_1.lesson_4.task_1;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Ivan Korol on 5/7/2018
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("C:\\for test"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method
        URL url = new URL(urlString);
        InputStream stream = url.openStream();

        Path temp = Files.createTempFile("temp-", ".tmp");
        Files.copy(stream, temp);

        String fileName = urlString.substring(urlString.lastIndexOf("/"));
        Path saveDir = Paths.get(downloadDirectory.toString(), fileName);
        Files.move(temp, saveDir);
        return saveDir;
    }
}
