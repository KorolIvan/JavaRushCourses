package Java_Collections.level_2.lesson_10.task_3.context;

import Java_Collections.level_2.lesson_10.task_3.service.impl.EJBServiceImpl;
import Java_Collections.level_2.lesson_10.task_3.service.impl.JMSServiceImpl;

/**
 * @author Ivan Korol on 5/23/2018
 */
public class InitialContext {
    public Object lookup(String jndiName) {

        if (jndiName.equalsIgnoreCase("EJBService")) {
            System.out.println("Looking up and creating a new EJBService object");
            return new EJBServiceImpl();
        } else if (jndiName.equalsIgnoreCase("JMSService")) {
            System.out.println("Looking up and creating a new JMSService object");
            return new JMSServiceImpl();
        }
        return null;
    }
}
