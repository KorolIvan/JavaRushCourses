package Java_Collections.level_9.cashMachine.command;

import Java_Collections.level_9.cashMachine.ConsoleHelper;
import Java_Collections.level_9.cashMachine.exception.InterruptOperationException;

/**
 * @author Ivan Korol on 7/16/2018
 */
class ExitCommand implements Command {
    @Override
    public void execute() throws InterruptOperationException{
        ConsoleHelper.writeMessage("Are you sure you want to quit? Y/N:");
        String answer = ConsoleHelper.readString();
        if(answer.equalsIgnoreCase("y")) {
            ConsoleHelper.writeMessage("Bay!");
        }
    }
}
