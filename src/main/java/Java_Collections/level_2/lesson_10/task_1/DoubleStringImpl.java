package Java_Collections.level_2.lesson_10.task_1;

import java.rmi.RemoteException;

/**
 * @author Ivan Korol on 5/21/2018
 */
public class DoubleStringImpl implements DoubleString {
    public String doubleString(String str) throws RemoteException {
        return str + str;
    }
}
