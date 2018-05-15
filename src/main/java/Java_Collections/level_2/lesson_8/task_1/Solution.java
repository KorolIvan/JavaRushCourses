package Java_Collections.level_2.lesson_8.task_1;

import java.lang.reflect.Proxy;

/**
 * @author Ivan Korol on 5/15/2018
 */
public class Solution {
    public static void main(String[] args) {
        SomeInterfaceWithMethods obj = getProxy();
        obj.stringMethodWithoutArgs();
        obj.voidMethodWithIntArg(1);

        /* expected output
        stringMethodWithoutArgs in
        inside stringMethodWithoutArgs
        stringMethodWithoutArgs out
        voidMethodWithIntArg in
        inside voidMethodWithIntArg
        inside voidMethodWithoutArgs
        voidMethodWithIntArg out
        */
    }

    public static SomeInterfaceWithMethods getProxy() {
        SomeInterfaceWithMethodsImpl original = new SomeInterfaceWithMethodsImpl();

        //Получаем параметры об ориганльном объекте
        ClassLoader classLoader = original.getClass().getClassLoader();
        Class<?>[] interfaces = original.getClass().getInterfaces();
        CustomInvocationHandler invocationHandler = new CustomInvocationHandler(original);

        return (SomeInterfaceWithMethods) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
