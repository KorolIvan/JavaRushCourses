package java_multithreading.level_9.lesson_9.restaurant.ad;

/**
 * @author Ivan Korol on 8/28/2018
 */
public class AdvertisementStorage {
    private static AdvertisementStorage advertisementStorage = new AdvertisementStorage();

    public static AdvertisementStorage getInstance() {
        return advertisementStorage;
    }

    private AdvertisementStorage() {

    }
}
