package java_core.level_17.lesson_10.task_11;

import level_17.lesson_10.task_11.Sex;

import java.util.Date;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Person {
    private String name;
    private Sex sex;
    private Date birthDay;

    private Person(String name, Sex sex, Date birthDay) {
        this.name = name;
        this.sex = sex;
        this.birthDay = birthDay;
    }

    public static level_17.lesson_10.task_11.Person createMale(String name, Date birthDay) {
        return new level_17.lesson_10.task_11.Person(name, Sex.MALE, birthDay);
    }

    public static level_17.lesson_10.task_11.Person createFemale(String name, Date birthDay) {
        return new level_17.lesson_10.task_11.Person(name, Sex.FEMALE, birthDay);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
