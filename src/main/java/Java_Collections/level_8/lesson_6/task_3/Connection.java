package Java_Collections.level_8.lesson_6.task_3;

/**
 * @author Ivan Korol on 6/21/2018
 */
public interface Connection {
    void connect() throws WrongDataException, ConnectionException;
    void write(Object data) throws WrongDataException, ConnectionException;
    Object read() throws WrongDataException, ConnectionException;
    void disconnect() throws WrongDataException, ConnectionException;
}
