package Java_Collections.level_2.lesson_10.task_1;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author Ivan Korol on 5/21/2018
 */
public class Solution {
    public static final String UNIC_BINDING_NAME = "double.string";
    public static Registry registry;

    //pretend we start rmi client as CLIENT_THREAD thread
    public static Thread CLIENT_THREAD = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                DoubleString dS = (DoubleString) registry.lookup(UNIC_BINDING_NAME);
                System.out.println(dS.doubleString("Hi"));

            } catch (RemoteException e) {
                e.printStackTrace();
            } catch (NotBoundException e) {
                e.printStackTrace();
            }
            //напишите тут ваш код
        }
    });

    public static void main(String[] args) {
        //pretend we start rmi server as main thread
        Remote stub = null;
        try {
            registry = LocateRegistry.createRegistry(2099);
            final DoubleStringImpl service = new DoubleStringImpl();

            stub = UnicastRemoteObject.exportObject(service, 0);
            registry.bind(UNIC_BINDING_NAME, stub);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }

        //start client
        CLIENT_THREAD.start();
    }
}
