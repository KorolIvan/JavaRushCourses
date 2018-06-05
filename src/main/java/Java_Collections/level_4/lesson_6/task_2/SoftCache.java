package Java_Collections.level_4.lesson_6.task_2;

import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Ivan Korol on 6/5/2018
 */
public class SoftCache {
    private Map<Long, SoftReference<AnyObject>> cacheMap = new ConcurrentHashMap<>();

    public AnyObject get(Long key) {
        SoftReference<AnyObject> softReference = cacheMap.get(key);
        if(softReference == null)
            return null;
        //напишите тут ваш код
        return softReference.get();
    }

    public AnyObject put(Long key, AnyObject value) {
        SoftReference<AnyObject> softReference = cacheMap.put(key, new SoftReference<>(value));
        if(softReference == null)
            return null;
        //напишите тут ваш код
        AnyObject anyObject = softReference.get();
        softReference.clear();
        return anyObject;
    }

    public AnyObject remove(Long key) {
        SoftReference<AnyObject> softReference = cacheMap.remove(key);
        if(softReference == null)
            return null;
        //напишите тут ваш код
        AnyObject anyObject = softReference.get();
        softReference.clear();
        return anyObject;
    }
}
