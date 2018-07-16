package Java_Collections.level_9.cashMachine;

import Java_Collections.level_9.cashMachine.command.CommandExecutor;
import Java_Collections.level_9.cashMachine.exception.InterruptOperationException;
import Java_Collections.level_9.cashMachine.exception.NotEnoughMoneyException;

import java.util.Locale;

/**
 * @author Ivan Korol on 7/16/2018
 */
public class CashMachine {
    public static final String RESOURCE_PATH = CashMachine.class.getPackage().getName() + ".resources.";
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        try {
            CommandExecutor.execute(Operation.LOGIN);
            Operation operation;
            do {
                operation = ConsoleHelper.askOperation();
                CommandExecutor.execute(operation);
            } while (operation != Operation.EXIT);
        }catch (InterruptOperationException e) {
           ConsoleHelper.writeMessage("Bay");
        }/*catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }*/
    }
}
