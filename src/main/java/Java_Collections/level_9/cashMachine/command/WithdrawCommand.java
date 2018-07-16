package Java_Collections.level_9.cashMachine.command;

import Java_Collections.level_9.cashMachine.ConsoleHelper;
import Java_Collections.level_9.cashMachine.CurrencyManipulator;
import Java_Collections.level_9.cashMachine.CurrencyManipulatorFactory;
import Java_Collections.level_9.cashMachine.exception.InterruptOperationException;
import Java_Collections.level_9.cashMachine.exception.NotEnoughMoneyException;

/**
 * @author Ivan Korol on 7/16/2018
 */
class WithdrawCommand implements Command {
    @Override
    public void execute() throws InterruptOperationException {
        String currencyCode;
        currencyCode = ConsoleHelper.askCurrencyCode();
        CurrencyManipulator manipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);
        int summ;

        while (true) {
            ConsoleHelper.writeMessage("please enter amount: ");
            String s = ConsoleHelper.readString();
            try
            {
                summ = Integer.parseInt(s);
            } catch (NumberFormatException e)
            {
                continue;
            }
            if (summ <= 0)
            {
                ConsoleHelper.writeMessage("amount cannot be empty");
                continue;
            }
            if (!manipulator.isAmountAvailable(summ))
            {
                ConsoleHelper.writeMessage("not enough money");
                continue;
            }
            try
            {
                manipulator.withdrawAmount(summ);
            } catch (NotEnoughMoneyException e) {
                e.printStackTrace();
            }
            ConsoleHelper.writeMessage(String.format("success.format", summ, currencyCode));
            break;
        }

    }
}
