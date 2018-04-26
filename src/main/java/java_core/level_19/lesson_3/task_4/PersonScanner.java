package java_core.level_19.lesson_3.task_4;


import java.io.IOException;

/**
 * @author Ivan Korol on 4/20/2018
 */
public interface PersonScanner {
    Person read() throws IOException;

    void close() throws IOException;
}
