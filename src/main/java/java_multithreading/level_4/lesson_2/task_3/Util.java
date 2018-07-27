package java_multithreading.level_4.lesson_2.task_3;

import java.lang.reflect.Method;

/**
 * @author Ivan Korol on 7/27/2018
 */
public class Util {
    //пример того, как можно использовать интерфейс-маркер
    //this method is available only for a SelfInterfaceMarker implementation
    public static void testClass(SelfInterfaceMarker interfaceMarker) throws UnsupportedInterfaceMarkerException {
        if(interfaceMarker == null){
            throw new UnsupportedInterfaceMarkerException();
        }
        for (Method method : interfaceMarker.getClass().getDeclaredMethods()) {
            System.out.println(method);
        }
    }
}
