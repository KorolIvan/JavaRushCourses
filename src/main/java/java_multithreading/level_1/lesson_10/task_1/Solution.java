package java_multithreading.level_1.lesson_10.task_1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * @author Ivan Korol on 7/17/2018
 */
public class Solution {
    public static void writeZipEntriesToFile(String zipFileName, String outputFileName) {
        Charset charset = StandardCharsets.UTF_8;
        Path outputFilePath = Paths.get(outputFileName);

        try {
            try (ZipFile zip = new ZipFile(zipFileName);
                 BufferedWriter writer = Files.newBufferedWriter(outputFilePath, charset)) {

                String newLine = System.getProperty("line.separator");
                for (Enumeration entries = zip.entries(); entries.hasMoreElements(); ) {
                    // Берем имя файла из архива и записываем его в результирующий файл
                    // Get the entry name and write it to the output file
                    String zipEntryName = ((ZipEntry) entries.nextElement()).getName() + newLine;
                    writer.write(zipEntryName, 0, zipEntryName.length());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
