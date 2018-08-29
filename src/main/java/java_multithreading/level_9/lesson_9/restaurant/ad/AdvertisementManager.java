package java_multithreading.level_9.lesson_9.restaurant.ad;

import java_multithreading.level_9.lesson_9.restaurant.ConsoleHelper;

/**
 * @author Ivan Korol on 8/28/2018
 */
public class AdvertisementManager {
    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();
    private int timeSeconds;

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }

    public void processVideos() {
        ConsoleHelper.writeMessage("calling processVideos method");
    }
}
