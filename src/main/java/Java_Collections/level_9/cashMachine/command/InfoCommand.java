package Java_Collections.level_9.cashMachine.command;

import Java_Collections.level_9.cashMachine.ConsoleHelper;
import Java_Collections.level_9.cashMachine.CurrencyManipulator;
import Java_Collections.level_9.cashMachine.CurrencyManipulatorFactory;

/**
 * @author Ivan Korol on 7/16/2018
 */
class InfoCommand implements Command {
    @Override
    public void execute() {
        boolean money = false;

        for (CurrencyManipulator currency : CurrencyManipulatorFactory.getAllCurrencyManipulators())
            if (currency.hasMoney()) {
                if (currency.getTotalAmount() > 0) {
                    ConsoleHelper.writeMessage(currency.getCurrencyCode() + " - " + currency.getTotalAmount());
                    money = true;
                }
            }

        if (!money)
            ConsoleHelper.writeMessage("No money available.");
    }
}

