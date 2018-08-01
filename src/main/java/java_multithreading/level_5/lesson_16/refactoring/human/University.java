package java_multithreading.level_5.lesson_16.refactoring.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ivan Korol on 7/31/2018
 */
public class University {
    private String name;
    private int age;
    private List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        //super(name, age, 0);
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        for(Student s: students){
            if(s.getAverageGrade() != 0.0 && s.getAverageGrade() == averageGrade) {
                return s;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        List<Double> list = new ArrayList<>();
        for(Student s: students) {
            list.add(s.getAverageGrade());
        }
        return getStudentWithAverageGrade(Collections.max(list));
    }

    public Student getStudentWithMinAverageGrade() {
        List<Double> list = new ArrayList<>();
        for(Student s: students) {
            list.add(s.getAverageGrade());
        }
        return getStudentWithAverageGrade(Collections.min(list));
    }

    public void expel(Student student) {
        students.remove(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
