package Java_Collections.level_9.cashMachine.command;

import Java_Collections.level_9.cashMachine.ConsoleHelper;
import Java_Collections.level_9.cashMachine.CurrencyManipulator;
import Java_Collections.level_9.cashMachine.CurrencyManipulatorFactory;

import java.io.IOException;

/**
 * @author Ivan Korol on 7/16/2018
 */
class DepositCommand implements Command {
    @Override
    public void execute() {
        String currencyCode;
        try {
            currencyCode = ConsoleHelper.askCurrencyCode();
            CurrencyManipulator currencyManipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);
            String[] s = ConsoleHelper.getValidTwoDigits(currencyCode);
            int nominal = Integer.parseInt(s[0]);
            int total = Integer.parseInt(s[1]);
            currencyManipulator.addAmount(nominal, total);
        } catch (NumberFormatException | IOException e) {
            ConsoleHelper.writeMessage("Error!");
        }
    }
}
