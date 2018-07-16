package Java_Collections.level_9.cashMachine;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ivan Korol on 7/16/2018
 */
public class CurrencyManipulator {
    private String currencyCode;
    private Map<Integer, Integer> denominations;

    public CurrencyManipulator(String currencyCode) {
        this.denominations = new HashMap<>();
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void addAmount(int denomination, int count) {
        if(denominations.containsKey(denomination)) {
            denominations.put(denomination, denominations.get(denomination) + count);
        }else {
            denominations.put(denomination, count);
        }
    }

    public int getTotalAmount() {
        int summ = 0;
        for(Map.Entry<Integer, Integer> pair: denominations.entrySet()) {
            summ += pair.getKey()*pair.getValue();
        }
        return summ;
    }

    public boolean hasMoney() {
        return denominations.size() != 0;
    }
}
