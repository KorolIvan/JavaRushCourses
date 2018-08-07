package java_multithreading.level_7.archiver.command;

import java_multithreading.level_7.archiver.ConsoleHelper;
import java_multithreading.level_7.archiver.FileProperties;
import java_multithreading.level_7.archiver.ZipFileManager;

import java.util.List;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class ZipContentCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("Просмотр содержимого архива.");
        ZipFileManager zipFileManager = getZipFileManager();
        ConsoleHelper.writeMessage("Содержимое архива:");
        List<FileProperties> files = zipFileManager.getFilesList();
        for (FileProperties file : files) {
            ConsoleHelper.writeMessage(file.toString());
        }
        ConsoleHelper.writeMessage("Содержимое архива прочитано.");
    }
}
