package Java_Collections.level_6.lesson_15.shortener.strategy;

import com.google.common.collect.HashBiMap;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class HashBiMapStorageStrategy implements StorageStrategy {
    HashBiMap<Long, String> data = HashBiMap.create();
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
        return data.inverse().get(value);
    }

    @Override
    public String getValue(Long key) {
        return data.get(key);
    }
}
