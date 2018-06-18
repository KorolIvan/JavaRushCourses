package Java_Collections.level_7.lesson_8.task_2.connectors;

import Java_Collections.level_7.lesson_8.task_2.security.SecurityChecker;
import Java_Collections.level_7.lesson_8.task_2.security.SecurityCheckerImpl;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class SecurityProxyConnector implements Connector {
    private SecurityChecker securityChecker;
    private SimpleConnector simpleConnector;

    public SecurityProxyConnector(String s) {
        this.securityChecker = new SecurityCheckerImpl();
        this.simpleConnector = new SimpleConnector(s);
    }

    @Override
    public void connect() {
        if(securityChecker.performSecurityCheck()) {
            simpleConnector.connect();
        }
    }
}
