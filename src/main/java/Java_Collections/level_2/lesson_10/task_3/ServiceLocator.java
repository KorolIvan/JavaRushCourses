package Java_Collections.level_2.lesson_10.task_3;

import Java_Collections.level_2.lesson_10.task_3.context.InitialContext;
import Java_Collections.level_2.lesson_10.task_3.service.Service;

/**
 * @author Ivan Korol on 5/23/2018
 */
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    /**
     * First check the service object available in cache
     * If service object not available in cache do the lookup using
     * JNDI initial context and get the service object. Add it to
     * the cache for future use.
     *
     * @param jndiName The name of service object in context
     * @return Object mapped to name in context
     */
    public static Service getService(String jndiName) {
       Service service = cache.getService(jndiName);
       if(service != null) {
           return service;
       }
        InitialContext context = new InitialContext();
       service = (Service) context.lookup(jndiName);
       cache.addService(service);
       return service;
    }
}
