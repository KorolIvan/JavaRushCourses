package Java_Collections.level_7.lesson_15.bigparser.query;

import Java_Collections.level_7.lesson_15.bigparser.Event;

import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * @author Ivan Korol on 6/20/2018
 */
public interface EventQuery {
    int getNumberOfAllEvents(Date after, Date before);

    Set<Event> getAllEvents(Date after, Date before);

    Set<Event> getEventsForIP(String ip, Date after, Date before);

    Set<Event> getEventsForUser(String user, Date after, Date before);

    Set<Event> getFailedEvents(Date after, Date before);

    Set<Event> getErrorEvents(Date after, Date before);

    int getNumberOfAttemptToSolveTask(int task, Date after, Date before);

    int getNumberOfSuccessfulAttemptToSolveTask(int task, Date after, Date before);

    Map<Integer, Integer> getAllSolvedTasksAndTheirNumber(Date after, Date before);

    Map<Integer, Integer> getAllDoneTasksAndTheirNumber(Date after, Date before);
}
