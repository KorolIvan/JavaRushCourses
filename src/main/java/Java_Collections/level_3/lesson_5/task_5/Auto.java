package Java_Collections.level_3.lesson_5.task_5;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * @author Ivan Korol on 5/24/2018
 */
@JsonAutoDetect
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "className")
public abstract class Auto {
    protected String name;
    protected String owner;
    protected int age;
}
