package Java_Collections.level_9.lesson_9.task_12;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Ivan Korol on 7/16/2018
 */
public class Software {
    int currentVersion;

    private Map<Integer, String> versionHistoryMap = new LinkedHashMap<>();

    public void addNewVersion(int version, String description) {
        if (version > currentVersion) {
            versionHistoryMap.put(version, description);
            currentVersion = version;
        }
    }

    public int getCurrentVersion() {
        return currentVersion;
    }

    public Map<Integer, String> getVersionHistoryMap() {
        return Collections.unmodifiableMap(versionHistoryMap);
    }

    public boolean rollback(int rollbackVersion) {
        if (!versionHistoryMap.containsKey(rollbackVersion))
            return false;
        Iterator<Integer> iterator = versionHistoryMap.keySet().iterator();
        while (iterator.hasNext()) {
            if(iterator.next() > rollbackVersion) {
                iterator.remove();
            }
            currentVersion = rollbackVersion;
        }

        return true;
    }
}
