package java_multithreading.level_7.archiver;

import java_multithreading.level_7.archiver.command.ExitCommand;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class Archiver {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter full path to the archive: ");
        String pathToArchive = reader.readLine();
        ZipFileManager zipFileManager  = new ZipFileManager(Paths.get(pathToArchive));
        System.out.println("Enter full path to the file which should be archived");
        String pathToFile = reader.readLine();
        zipFileManager.createZip(Paths.get(pathToFile));
        ExitCommand exitCommand = new ExitCommand();
        exitCommand.execute();
    }
}
