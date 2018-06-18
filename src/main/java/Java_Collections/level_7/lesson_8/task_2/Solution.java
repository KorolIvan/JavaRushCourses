package Java_Collections.level_7.lesson_8.task_2;

import Java_Collections.level_7.lesson_8.task_2.connectors.Connector;
import Java_Collections.level_7.lesson_8.task_2.connectors.SecurityProxyConnector;
import Java_Collections.level_7.lesson_8.task_2.connectors.SimpleConnector;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class Solution {
    public static void main(String[] args) {
        Connector securityProxyConnector = new SecurityProxyConnector("google.com");
        Connector simpleConnector = new SimpleConnector("javarush.ru");

        System.out.println("Connecting with SimpleConnector...");
        simpleConnector.connect();

        System.out.println("----------------------------------------------------");

        System.out.println("Connecting with SecurityProxyConnector...");
        securityProxyConnector.connect();
    }
}
