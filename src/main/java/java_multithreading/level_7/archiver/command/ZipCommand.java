package java_multithreading.level_7.archiver.command;

import java_multithreading.level_7.archiver.ConsoleHelper;
import java_multithreading.level_7.archiver.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Ivan Korol on 8/7/2018
 */
public abstract class ZipCommand implements Command {
    public ZipFileManager getZipFileManager() throws Exception{
        ConsoleHelper.writeMessage("Введите полный путь файла архива:");
        Path zipPath = Paths.get(ConsoleHelper.readString());
        return new ZipFileManager(zipPath);
    }
}
