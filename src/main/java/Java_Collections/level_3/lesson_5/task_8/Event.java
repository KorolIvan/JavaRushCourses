package Java_Collections.level_3.lesson_5.task_8;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author Ivan Korol on 5/24/2018
 */
public class Event {
    public String name;

    @JsonFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    public Date eventDate;

    public Event(String name) {
        this.name = name;
        eventDate = new Date();
    }
}
