package Java_Collections.level_9.cashMachine.command;

import Java_Collections.level_9.cashMachine.CashMachine;
import Java_Collections.level_9.cashMachine.ConsoleHelper;
import Java_Collections.level_9.cashMachine.CurrencyManipulator;
import Java_Collections.level_9.cashMachine.CurrencyManipulatorFactory;
import Java_Collections.level_9.cashMachine.exception.InterruptOperationException;

import java.util.ResourceBundle;

/**
 * @author Ivan Korol on 7/16/2018
 */
class InfoCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + ".info_en");

    @Override
    public void execute() throws InterruptOperationException {
        boolean money = false;

        ConsoleHelper.writeMessage(res.getString("before"));
        for (CurrencyManipulator c : CurrencyManipulatorFactory.getAllCurrencyManipulators()) {
            if (c.hasMoney()) {
                if (c.getTotalAmount() > 0) {
                    ConsoleHelper.writeMessage(c.getCurrencyCode() + " - " + c.getTotalAmount());
                    money = true;
                }
            }
        }
        if (!money) {
            ConsoleHelper.writeMessage(res.getString("no.money"));
        }
    }
}

