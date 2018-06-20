package Java_Collections.level_7.lesson_15.bigparser.query;

import Java_Collections.level_7.lesson_15.bigparser.Event;
import Java_Collections.level_7.lesson_15.bigparser.Status;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Set;

/**
 * @author Ivan Korol on 6/18/2018
 */
public interface IPQuery {
    int getNumberOfUniqueIPs(Date after, Date before) throws IOException, ParseException;

    Set<String> getUniqueIPs(Date after, Date before) throws IOException, ParseException;

    Set<String> getIPsForUser(String user, Date after, Date before);

    Set<String> getIPsForEvent(Event event, Date after, Date before);

    Set<String> getIPsForStatus(Status status, Date after, Date before);
}
