package Java_Collections.level_9.cashMachine;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ivan Korol on 7/16/2018
 */
public abstract class CurrencyManipulatorFactory {
    private static Map<String, CurrencyManipulator> map = new HashMap<>();

    private CurrencyManipulatorFactory() {
    }

    public static CurrencyManipulator  getManipulatorByCurrencyCode(String currencyCode){
        if (!map.containsKey( currencyCode.toUpperCase()))
            map.put(currencyCode.toUpperCase(), new CurrencyManipulator(currencyCode));

        return map.get(currencyCode.toUpperCase());
    }

    public static Collection<CurrencyManipulator> getAllCurrencyManipulators() {
        return map.values();
    }

}
