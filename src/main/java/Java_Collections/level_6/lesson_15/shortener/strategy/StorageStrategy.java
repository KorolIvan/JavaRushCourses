package Java_Collections.level_6.lesson_15.shortener.strategy;

/**
 * @author Ivan Korol on 6/15/2018
 */
public interface StorageStrategy {
    boolean containsKey(Long key);
    boolean containsValue(String value);
    void put(Long key, String value);
    Long getKey(String value);
    String getValue(Long key);
}
