package java_multithreading.level_5.lesson_16.refactoring.human;

/**
 * @author Ivan Korol on 7/31/2018
 */
public class Professor extends Teacher {
    Professor(String name, int age, int numberOfStudents) {
        super(name, age, numberOfStudents);
    }

    public void live() {
        teach();
    }

}
