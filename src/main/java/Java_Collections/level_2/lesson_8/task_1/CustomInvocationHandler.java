package Java_Collections.level_2.lesson_8.task_1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Ivan Korol on 5/15/2018
 */
public class CustomInvocationHandler implements InvocationHandler {
    private SomeInterfaceWithMethods someInterfaceWithMethods;
    public CustomInvocationHandler(SomeInterfaceWithMethods interfaceWithMethods) {
        this.someInterfaceWithMethods = interfaceWithMethods;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("["+ method.getName() +" in]");
        System.out.println("["+ method.getName() +" out]");

        return method.invoke(someInterfaceWithMethods, args);
    }
}
