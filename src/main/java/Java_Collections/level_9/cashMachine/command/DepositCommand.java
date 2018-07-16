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
class DepositCommand implements Command {
    private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + ".deposit_en");

    @Override
    public void execute() throws InterruptOperationException{
        ConsoleHelper.writeMessage(res.getString("before"));
        String curCode = ConsoleHelper.askCurrencyCode();
        String[] moneyAndAmount = ConsoleHelper.getValidTwoDigits(curCode);
        CurrencyManipulator temp = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(curCode);
        try {
            int k = Integer.parseInt(moneyAndAmount[0]);
            int l = Integer.parseInt(moneyAndAmount[1]);
            temp.addAmount(k, l);
            ConsoleHelper.writeMessage(String.format(res.getString("success.format"), k * l, curCode));
        } catch (NumberFormatException ex) {
            ConsoleHelper.writeMessage(res.getString("invalid.data"));
        }
    }
}
