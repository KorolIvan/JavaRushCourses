package java_multithreading.level_7.archiver;

import java_multithreading.level_7.archiver.command.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class CommandExecutor {
    private static final Map<Operation, Command> allKnownCommandsMap = new HashMap<>();
    static {
        allKnownCommandsMap.put(Operation.ADD, new ZipAddCommand());
        allKnownCommandsMap.put(Operation.CONTENT, new ZipContentCommand());
        allKnownCommandsMap.put(Operation.CREATE, new ZipCreateCommand());
        allKnownCommandsMap.put(Operation.EXIT, new ExitCommand());
        allKnownCommandsMap.put(Operation.EXTRACT, new ZipExtractCommand());
        allKnownCommandsMap.put(Operation.REMOVE, new ZipRemoveCommand());
    }

    public static void execute(Operation operation) throws Exception {
        if(allKnownCommandsMap.containsKey(operation)) {
            allKnownCommandsMap.get(operation).execute();
        }
    }

    private CommandExecutor(){}
}
