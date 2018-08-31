package java_multithreading.level_9.lesson_9.restaurant.statistic.event;

import java_multithreading.level_9.lesson_9.restaurant.ad.Advertisement;

import java.util.Date;
import java.util.List;

/**
 * @author Ivan Korol on 8/31/2018
 */
public class VideoSelectedEventDataRow implements EventDataRow {
    private List<Advertisement> optimalVideoSet;
    private long amount;
    private int totalDuration;
    private Date currentDate;

    public VideoSelectedEventDataRow(List<Advertisement> optimalVideoSet, long amount, int totalDuration) {
        this.optimalVideoSet = optimalVideoSet;
        this.amount = amount;
        this.totalDuration = totalDuration;
        this.currentDate = new Date();
    }

    @Override
    public EventType getType() {
        return EventType.SELECTED_VIDEOS;
    }
}
