package Java_Collections.level_2.lesson_10.task_3.service;

import Java_Collections.level_2.lesson_10.task_3.ServiceLocator;

/**
 * @author Ivan Korol on 5/23/2018
 */
public class Solution {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("EJBService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("JMSService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("EJBService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("JMSService");
        service.execute();

    }
}
