package Java_Collections.level_2.lesson_10.task_3.service.impl;

import Java_Collections.level_2.lesson_10.task_3.service.Service;

/**
 * @author Ivan Korol on 5/23/2018
 */
public class JMSServiceImpl implements Service {

    @Override
    public void execute() {
        System.out.println("Executing JMSService");
    }

    @Override
    public String getName() {
        return "JMSService";
    }

}

