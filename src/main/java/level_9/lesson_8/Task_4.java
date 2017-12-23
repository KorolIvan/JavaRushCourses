package level_9.lesson_8;

import java.io.IOException;
import java.rmi.RemoteException;

public class Task_4 {
    public static void main(String[] args) {
        processExceptions(new Task_4());

    }

    public static void processExceptions(Task_4 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }catch (RemoteException e) {
            System.out.println(e);
        }catch (NoSuchFieldException e) {
            System.out.println(e);
        }catch (IOException e) {
            System.out.println(e);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
