package java_multithreading.level_7.archiver.command;

import java_multithreading.level_7.archiver.ConsoleHelper;
import java_multithreading.level_7.archiver.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class ZipRemoveCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Удаление файла из архива.");
        ZipFileManager zipFileManager = getZipFileManager();
        ConsoleHelper.writeMessage("Введите полный путь файла в архиве:");
        Path sourcePath = Paths.get(ConsoleHelper.readString());
        zipFileManager.removeFile(sourcePath);
        ConsoleHelper.writeMessage("Удаление из архива завершено.");
    }
}
