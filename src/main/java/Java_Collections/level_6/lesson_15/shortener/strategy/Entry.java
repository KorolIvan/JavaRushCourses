package Java_Collections.level_6.lesson_15.shortener.strategy;

import java.io.Serializable;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class Entry implements Serializable {
    Long key;
    String value;
    Entry next;
    int hash;

    public Entry(int hash, Long key, String value, Entry next) {
        this.key = key;
        this.value = value;
        this.next = next;
        this.hash = hash;
    }

    public Long getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return (key == 0? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Entry)){
            return false;
        }

        Long key1 = getKey();
        Long key2 = ((Entry)o).getKey();
        String value1 = getValue();
        String value2 = ((Entry) o).getValue();
        return key1 == key2 && value1.equals(value2);
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }
}
