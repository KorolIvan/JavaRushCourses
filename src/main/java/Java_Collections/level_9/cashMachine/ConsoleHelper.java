package Java_Collections.level_9.cashMachine;

import Java_Collections.level_9.cashMachine.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ivan Korol on 7/16/2018
 */
public class ConsoleHelper {
    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws InterruptOperationException {
        String input = "";
        try {
            input = bis.readLine();
            if (input.equalsIgnoreCase("exit")) {
                throw new InterruptOperationException();
            }
        } catch (IOException ignored) {
        }

        return input;
    }

    public static String askCurrencyCode() throws InterruptOperationException {
        String currencyCode = null;
        while (true) {
            writeMessage("Please choice currency code: ");
            currencyCode = readString();
            if (currencyCode.length() == 3) {
                break;
            } else {
                writeMessage("Error, please try again");
            }
        }

        return currencyCode.toUpperCase();
    }

    public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException {
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

    public static Operation askOperation() throws InterruptOperationException{
        do {
            writeMessage("select operation \n 1 Info \n 2 Deposit \n 3 Withdraw \n 4 Exit");
            try {
                int choice = Integer.parseInt(readString());
                return Operation.getAllowableOperationByOrdinal(choice);
            } catch (IllegalArgumentException e) {
                writeMessage("your input is wrong. Please try again!");
                continue;
            }
        } while (true);
    }
}
