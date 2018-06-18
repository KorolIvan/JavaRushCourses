package Java_Collections.level_7.lesson_6.task_4.retrievers;

import Java_Collections.level_7.lesson_6.task_4.storage.Storage;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class OriginalRetriever implements Retriever {
    Storage storage;

    public OriginalRetriever(Storage storage) {
        this.storage = storage;
    }

    @Override
    public Object retrieve(long id) {
        return storage.get(id);
    }
}
