package java_multithreading.level_5.lesson_16.refactoring.human;

/**
 * @author Ivan Korol on 7/31/2018
 */
public class Worker extends Human {
    private double salary;
    public String company;

    public Worker(String name, int age) {
        super(name, age);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
