package Java_Collections.level_9.cashMachine.command;

import Java_Collections.level_9.cashMachine.CashMachine;
import Java_Collections.level_9.cashMachine.ConsoleHelper;
import Java_Collections.level_9.cashMachine.exception.InterruptOperationException;

import java.util.ResourceBundle;

/**
 * @author Ivan Korol on 7/16/2018
 */
class ExitCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + ".exit_en");

    @Override
    public void execute() throws InterruptOperationException{
        ConsoleHelper.writeMessage(res.getString("exit.question.y.n"));

        if (ConsoleHelper.readString().equals("y"))
            ConsoleHelper.writeMessage(res.getString("thank.message"));
    }
}
