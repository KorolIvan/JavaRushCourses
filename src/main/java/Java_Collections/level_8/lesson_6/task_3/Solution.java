package Java_Collections.level_8.lesson_6.task_3;

/**
 * @author Ivan Korol on 6/21/2018
 */
public class Solution {
    private final Connection connection;

    public Solution() throws SolutionException {
        try {
            connection = new ConnectionMock();
            connection.connect();
        } catch (WrongDataException | ConnectionException e) {
            //throw new SolutionException("WrongDataException: " + e.getMessage());
            throw new SolutionException(e.getClass().getSimpleName() + ": " + e.getMessage());
        } /*catch (ConnectionException e) {
            throw new SolutionException("ConnectionException: " + e.getMessage());
        }*/
    }

    public void write(Object data) throws SolutionException {
        try {
            connection.write(data);
        } catch (WrongDataException | ConnectionException e) {
            throw new SolutionException(e.getClass().getSimpleName() + ": " + e.getMessage());
            //throw new SolutionException("WrongDataException: " + e.getMessage());
        } /*catch (ConnectionException e) {
            throw new SolutionException("ConnectionException: " + e.getMessage());
        }*/
    }

    public Object read() throws SolutionException {
        try {
            return connection.read();
        }catch (WrongDataException | ConnectionException e) {
            throw new SolutionException(e.getClass().getSimpleName() + ": " + e.getMessage());
            //throw new SolutionException("WrongDataException: " + e.getMessage());
        }  /*catch (WrongDataException e) {
            throw new SolutionException("WrongDataException: " + e.getMessage());
        } catch (ConnectionException e) {
            throw new SolutionException("ConnectionException: " + e.getMessage());
        }*/
    }

    public void disconnect() throws SolutionException {
        try {
            connection.disconnect();
        } catch (WrongDataException | ConnectionException e) {
            throw new SolutionException(e.getClass().getSimpleName() + ": " + e.getMessage());
            //throw new SolutionException("WrongDataException: " + e.getMessage());
        } /* catch (WrongDataException e) {
            throw new SolutionException("WrongDataException: " + e.getMessage());
        } catch (ConnectionException e) {
            throw new SolutionException("ConnectionException: " + e.getMessage());
        }*/
    }

    public static void main(String[] args) {

    }
}
