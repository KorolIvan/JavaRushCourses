package java_core.level_19.lesson_11.task_3;

import java.util.Date;

/**
 * @author Ivan Korol on 4/26/2018
 */
public class Person {
    private String name;
    private Date birthday;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
}
