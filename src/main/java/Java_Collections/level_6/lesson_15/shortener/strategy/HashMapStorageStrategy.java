package Java_Collections.level_6.lesson_15.shortener.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ivan Korol on 6/15/2018
 */
public class HashMapStorageStrategy implements StorageStrategy {
    private HashMap<Long, String> data = new HashMap<>();

    @Override
    public boolean containsKey(Long key) {
        return data.containsKey(key);
    }

    @Override
    public boolean containsValue(String value) {
        return data.containsValue(value);
    }

    @Override
    public void put(Long key, String value) {
        data.put(key, value);
    }

    @Override
    public Long getKey(String value) {
        HashMap<Long, String> temp = new HashMap<>();
        for (Map.Entry<Long, String> entry : data.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }

    @Override
    public String getValue(Long key) {
        return data.get(key);
    }
}
