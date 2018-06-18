package Java_Collections.level_7.lesson_6.task_4.retrievers;

import Java_Collections.level_7.lesson_6.task_4.cache.LRUCache;
import Java_Collections.level_7.lesson_6.task_4.storage.Storage;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class CachingProxyRetriever implements Retriever {
    private OriginalRetriever originalRetriever;
    private LRUCache lruCache;
    private Storage storage;

    public CachingProxyRetriever(Storage storage) {
        this.storage = storage;
        this.originalRetriever = new OriginalRetriever(storage);
        lruCache = new LRUCache<>(16);
    }


    @Override
    public Object retrieve(long id) {
        Object o = lruCache.find(id);
        if(o == null) {
            o = originalRetriever.retrieve(id);
            lruCache.set(id, o);
        }
        return o;
    }
}
