package Java_Collections.level_8.lesson_6.task_3;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class ConnectionMock implements Connection {
    @Override
    public void connect() throws WrongDataException, ConnectionException {
    }

    @Override
    public void write(Object data) throws WrongDataException, ConnectionException {
    }

    @Override
    public Object read() throws WrongDataException, ConnectionException {
        return null;
    }

    @Override
    public void disconnect() throws WrongDataException, ConnectionException {

    }
}
