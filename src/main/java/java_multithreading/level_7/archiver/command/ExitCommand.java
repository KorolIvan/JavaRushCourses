package java_multithreading.level_7.archiver.command;

import java_multithreading.level_7.archiver.ConsoleHelper;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
