package Java_Collections.level_9.cashMachine;

import java.io.IOException;
import java.util.Locale;

/**
 * @author Ivan Korol on 7/16/2018
 */
public class CashMachine {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.ENGLISH);

        CurrencyManipulator currencyManipulator;

        String code = ConsoleHelper.askCurrencyCode();
        String[] strs = ConsoleHelper.getValidTwoDigits(code);
        currencyManipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(code);
        currencyManipulator.addAmount(Integer.parseInt(strs[0]), Integer.parseInt(strs[1]));
        System.out.println(currencyManipulator.getTotalAmount());
    }
}
