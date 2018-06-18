package Java_Collections.level_7.lesson_8.task_2.connectors;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class SimpleConnector implements Connector {
    private String resourceString;

    public SimpleConnector(String resourceString) {
        this.resourceString = resourceString;
    }

    @Override
    public void connect() {
        System.out.println("Successfully connected to " + resourceString);
    }
}
