package Java_Collections.level_9.cashMachine;

import Java_Collections.level_9.cashMachine.command.CommandExecutor;
import java.util.Locale;

/**
 * @author Ivan Korol on 7/16/2018
 */
public class CashMachine {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        Operation operation;
        do {
            operation = ConsoleHelper.askOperation();
            CommandExecutor.execute(operation);
        } while (operation != Operation.EXIT);
    }
}
