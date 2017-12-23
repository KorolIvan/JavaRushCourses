package level_9.lesson_8;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class Task_3 {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try {
            processExceptions();
        }catch (FileSystemException e){
            BEAN.log(e);
        }
    }

    public static void processExceptions() throws FileSystemException {
        try {
            BEAN.methodThrowExceptions();
        }catch (FileSystemException e) {
            BEAN.log(e);
            throw e;
        }catch (CharConversionException e) {
            BEAN.log(e);
        }catch (IOException e) {
            BEAN.log(e);
        }

    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}
