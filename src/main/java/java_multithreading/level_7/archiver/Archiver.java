package java_multithreading.level_7.archiver;

import java_multithreading.level_7.archiver.exception.WrongZipFileException;

import java.io.IOException;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class Archiver {
    static Operation operation;
    public static void main(String[] args) throws Exception {
       try {
           while (true) {
               operation = askOperation();
               CommandExecutor.execute(operation);
               if(operation==Operation.EXIT){
                   break;
               }
           }
       } catch (WrongZipFileException e) {
           ConsoleHelper.writeMessage("Вы не выбрали файл архива или выбрали неверный файл.");
       } catch (Exception message) {
           ConsoleHelper.writeMessage("Произошла ошибка. Проверьте введенные данные.");
       }
    }

    public static Operation askOperation() throws IOException {
        ConsoleHelper.writeMessage("Выберите операцию:");
        ConsoleHelper.writeMessage(" " + Operation.CREATE.ordinal() + " - упаковать файлы в архив");
        ConsoleHelper.writeMessage(" " + Operation.ADD.ordinal() + " - добавить файл в архив");
        ConsoleHelper.writeMessage(" " + Operation.REMOVE.ordinal() + " - удалить файл из архива");
        ConsoleHelper.writeMessage(" " + Operation.EXTRACT.ordinal() + " - распаковать архив");
        ConsoleHelper.writeMessage(" " + Operation.CONTENT.ordinal() + " - просмотреть содержимое архива");
        ConsoleHelper.writeMessage(" " + Operation.EXIT.ordinal() + " - выход");
        return Operation.values()[ConsoleHelper.readInt()];
    }
}
