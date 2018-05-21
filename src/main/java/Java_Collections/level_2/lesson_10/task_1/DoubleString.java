package Java_Collections.level_2.lesson_10.task_1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Ivan Korol on 5/21/2018
 */
public interface DoubleString extends Remote {
    String doubleString(String str) throws RemoteException;
}
