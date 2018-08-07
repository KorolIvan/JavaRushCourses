package java_multithreading.level_6.chat.client;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class ClientGuiModel {
    private final Set<String> allUserNames = new HashSet<>();
    private String newMessage;

    public Set<String> getAllUserNames() {
        return Collections.unmodifiableSet(allUserNames);
    }

    public String getNewMessage() {
        return newMessage;
    }

    public void setNewMessage(String newMessage) {
        this.newMessage = newMessage;
    }

    public void addUser(String newUserName) {
        allUserNames.add(newUserName);
    }

    public void deleteUser(String userName) {
        if(allUserNames.contains(userName)) {
            allUserNames.remove(userName);
        }

    }
}
