package java_multithreading.level_9.lesson_9.restaurant.statistic.event;

import java.util.Date;

/**
 * @author Ivan Korol on 8/31/2018
 */
public class NoAvailableVideoEventDataRow implements EventDataRow {
    private int totalDuration;
    private Date currentDate;

    public NoAvailableVideoEventDataRow(int totalDuration) {
        this.totalDuration = totalDuration;
        this.currentDate = new Date();
    }
}
