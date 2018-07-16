package Java_Collections.level_9.cashMachine.command;

import Java_Collections.level_9.cashMachine.exception.InterruptOperationException;

/**
 * @author Ivan Korol on 7/16/2018
 */
interface Command {
    void execute() throws InterruptOperationException;
}
