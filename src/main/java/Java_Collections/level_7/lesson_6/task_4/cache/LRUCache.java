package Java_Collections.level_7.lesson_6.task_4.cache;

import java.util.LinkedHashMap;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    @Override
    protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
        // Remove the eldest element whenever size of cache exceeds the capacity
        return (size() > this.capacity);
    }

    public LRUCache(int capacity) {
        // Call constructor of LinkedHashMap with accessOrder set to true to
        // achieve LRU Cache behavior
        super(capacity + 1, 1.0f, true);
        this.capacity = capacity;
    }

    public V find(K key) {
        return super.get(key);
    }

    public void set(K key, V value) {
        super.put(key, value);
    }
}
