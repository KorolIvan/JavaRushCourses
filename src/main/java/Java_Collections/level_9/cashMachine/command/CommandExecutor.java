package Java_Collections.level_9.cashMachine.command;

import Java_Collections.level_9.cashMachine.Operation;
import Java_Collections.level_9.cashMachine.exception.InterruptOperationException;
import Java_Collections.level_9.cashMachine.exception.NotEnoughMoneyException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ivan Korol on 7/16/2018
 */
public class CommandExecutor {
    private static final Map<Operation, Command> allKnownCommandsMap;
    static{
        allKnownCommandsMap = new HashMap<>();
        allKnownCommandsMap.put(Operation.LOGIN, new LoginCommand());
        allKnownCommandsMap.put(Operation.INFO, new InfoCommand());
        allKnownCommandsMap.put(Operation.DEPOSIT, new DepositCommand());
        allKnownCommandsMap.put(Operation.WITHDRAW, new WithdrawCommand());
        allKnownCommandsMap.put(Operation.EXIT, new ExitCommand());
    }

    private CommandExecutor() {
    }

    public static final void execute(Operation operation) throws InterruptOperationException {
        allKnownCommandsMap.get(operation).execute();
    }

}
