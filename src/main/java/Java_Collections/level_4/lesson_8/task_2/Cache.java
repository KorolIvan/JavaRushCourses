package Java_Collections.level_4.lesson_8.task_2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author Ivan Korol on 6/8/2018
 */
public class Cache<K, V> {
    private Map<K, V> cache = new WeakHashMap<>();   //TODO add your code here

    public V getByKey(K key, Class<V> clazz) throws Exception {
        //TODO add your code here
        if(!cache.containsKey(key)){
            cache.put(key, clazz.getConstructor(key.getClass()).newInstance(key));
        }
        return cache.get(key);
    }

    public boolean put(V obj) {
        Method method = null;
        try{
            method = obj.getClass().getDeclaredMethod("getKey");
            method.setAccessible(true);
            cache.put((K) method.invoke(obj), obj);
            return cache.containsKey((K) method.invoke(obj));
        } catch (NoSuchMethodException e) {

        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        }
        //TODO add your code here
        return false;
    }

    public int size() {
        return cache.size();
    }
}
