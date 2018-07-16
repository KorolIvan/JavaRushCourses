package Java_Collections.level_9.cashMachine.command;

import Java_Collections.level_9.cashMachine.CashMachine;
import Java_Collections.level_9.cashMachine.ConsoleHelper;
import Java_Collections.level_9.cashMachine.exception.InterruptOperationException;

import java.util.ResourceBundle;

/**
 * @author Ivan Korol on 7/16/2018
 */
class LoginCommand implements Command {
    private ResourceBundle validCreditCards = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + ".verifiedCards");
    @Override
    public void execute() throws InterruptOperationException {
        while (true) {
            ConsoleHelper.writeMessage("Please specify your credit card number and pin code or type 'EXIT' for exiting");
            String s1 = ConsoleHelper.readString();
            if(s1.equalsIgnoreCase("exit")) {
                throw new InterruptOperationException();
            }
            String s2 = ConsoleHelper.readString();
            if (validCreditCards.containsKey(s1)) {
                if (validCreditCards.getString(s1).equals(s2))
                    ConsoleHelper.writeMessage(String.format("Credit card [%s] is verified successfully!", s1));
                else {
                    ConsoleHelper.writeMessage(String.format("Credit card [%s] is not verified", s1));
                    ConsoleHelper.writeMessage("Please try again or type 'EXIT' for urgent exiting");
                    continue;
                }
            } else {
                ConsoleHelper.writeMessage(String.format("Credit card [%s] is not verified", s1));
                ConsoleHelper.writeMessage("Please specify valid credit card number - 12 digits, pin code - 4 digits.");
                continue;
            }

            break;
        }
    }
}
