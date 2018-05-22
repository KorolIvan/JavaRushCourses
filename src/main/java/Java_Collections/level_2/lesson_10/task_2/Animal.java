package Java_Collections.level_2.lesson_10.task_2;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Ivan Korol on 5/21/2018
 */
public interface Animal extends Remote {
    void say() throws RemoteException;

    void printName() throws RemoteException;
}

