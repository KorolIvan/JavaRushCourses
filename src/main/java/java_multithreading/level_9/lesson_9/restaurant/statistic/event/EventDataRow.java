package java_multithreading.level_9.lesson_9.restaurant.statistic.event;

import java.util.Date;

/**
 * @author Ivan Korol on 8/31/2018
 */
public interface EventDataRow {
    EventType getType();
    Date getDate();
    int getTime();
}
