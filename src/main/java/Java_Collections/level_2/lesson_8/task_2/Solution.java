package Java_Collections.level_2.lesson_8.task_2;

import java.lang.reflect.Proxy;

/**
 * @author Ivan Korol on 5/15/2018
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        test(solution.getProxy(Item.class));                        //true false false
        test(solution.getProxy(Item.class, Small.class));           //true false true
        test(solution.getProxy(Item.class, Big.class, Small.class));//true true true
        test(solution.getProxy(Big.class, Small.class));            //true true true т.к. Big наследуется от Item
        test(solution.getProxy(Big.class));                         //true true false т.к. Big наследуется от Item
    }

    public <T extends Item> T getProxy(Class<T> itemClass, Class... args) {
        ItemInvocationHandler itemInvocationHandler = new ItemInvocationHandler();

        ClassLoader classLoader = itemClass.getClassLoader();
        Class<?>[] interfaces = new Class[args.length +1];

        interfaces[0] = itemClass;
        System.arraycopy(args, 0, interfaces, 1, args.length);

        return (T) Proxy.newProxyInstance(classLoader, interfaces, itemInvocationHandler);
    }


    private static void test(Object proxy) {
        boolean isItem = proxy instanceof Item;
        boolean isBig = proxy instanceof Big;
        boolean isSmall = proxy instanceof Small;

        System.out.format("%b %b %b\n", isItem, isBig, isSmall);
    }
}
