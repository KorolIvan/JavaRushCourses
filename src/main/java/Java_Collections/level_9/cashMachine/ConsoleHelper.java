package Java_Collections.level_9.cashMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ivan Korol on 7/16/2018
 */
public class ConsoleHelper {
    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){
        System.out.println(message);
    }

    public static String readString() throws IOException {
        return bis.readLine();
    }

    public static String askCurrencyCode() throws IOException {
        String currencyCode = null;
        while (true) {
            writeMessage("Please choice currency code: ");
            currencyCode = readString();
            if (currencyCode.length() == 3) {
                break;
            }else {
                writeMessage("Error, please try again");
            }
        }

        return currencyCode.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode) throws IOException {
        writeMessage("Input nominal and total");
        String[] input;
        while (true) {
            input = readString().split(" ");

            int nominal = 0;
            int total = 0;
            try {
                nominal = Integer.parseInt(input[0]);
                total = Integer.parseInt(input[1]);
            } catch (Exception e) {
                writeMessage("Error, Repeat again:");
                continue;
            }
            if (nominal <= 0 || total <= 0) {
                writeMessage("Error, Repeat again:");
                continue;
            }
            break;
        }
        return input;
    }

    public static Operation askOperation() {
        do {
            writeMessage("select operation \n 1 Info \n 2 Deposit \n 3 Withdraw \n 4 Exit");
            try {
                int choice = Integer.parseInt(readString());
                return Operation.getAllowableOperationByOrdinal(choice);
            } catch (IllegalArgumentException | IOException e) {
                writeMessage("your input is wrong. Please try again!");
                continue;
            }
        }while (true);
    }
}
