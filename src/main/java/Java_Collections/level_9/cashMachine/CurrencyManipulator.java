package Java_Collections.level_9.cashMachine;

import java.util.Map;

/**
 * @author Ivan Korol on 7/16/2018
 */
public class CurrencyManipulator {
    private String currencyCode;
    private Map<Integer, Integer> denominations;

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }
}
