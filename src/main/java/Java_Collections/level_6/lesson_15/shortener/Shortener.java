package Java_Collections.level_6.lesson_15.shortener;

import Java_Collections.level_6.lesson_15.shortener.strategy.StorageStrategy;

/**
 * @author Ivan Korol on 6/15/2018
 */
public class Shortener {
    private Long lastId = 0L;
    private StorageStrategy storageStrategy;

    public Shortener(StorageStrategy storageStrategy) {
        this.storageStrategy = storageStrategy;
    }

    public synchronized Long getId(String string) {
        if (!storageStrategy.containsValue(string)) {
            lastId += 1;
            storageStrategy.put(lastId, string);
        }

        return storageStrategy.getKey(string);
    }

    public synchronized String getString(Long id) {
        return storageStrategy.getValue(id);
    }
}
