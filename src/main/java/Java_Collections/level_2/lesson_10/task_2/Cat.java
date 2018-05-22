package Java_Collections.level_2.lesson_10.task_2;

import java.rmi.RemoteException;

/**
 * @author Ivan Korol on 5/21/2018
 */
public class Cat implements Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void say() throws RemoteException {
        System.out.println("meow");
    }

    @Override
    public void printName() throws RemoteException {
        System.out.print("Cat " + name + " ");
    }
}
