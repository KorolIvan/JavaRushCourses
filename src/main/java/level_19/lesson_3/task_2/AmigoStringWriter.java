package level_19.lesson_3.task_2;

import java.io.IOException;

/**
 * @author Ivan Korol on 4/20/2018
 */
public interface AmigoStringWriter {
    void flush() throws IOException;
    void writeString(String s) throws IOException;
    void close() throws IOException;
}
