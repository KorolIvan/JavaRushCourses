package java_multithreading.level_5.lesson_16.refactoring.human;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivan Korol on 7/31/2018
 */
public class Teacher extends Human {
    private List<Human> children = new ArrayList<>();
    private int numberOfStudents;
    private String university;

    public Teacher(String name, int age, int numberOfStudents) {
        super(false);
        this.name = name;
        this.age = age;
        this.numberOfStudents = numberOfStudents;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public void live() {
        teach();
    }

    public void teach() {
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void printData() {
        System.out.println("Преподаватель: " + name);
    }
}
