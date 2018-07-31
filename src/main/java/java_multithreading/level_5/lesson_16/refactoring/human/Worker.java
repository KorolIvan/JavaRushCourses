package java_multithreading.level_5.lesson_16.refactoring.human;

/**
 * @author Ivan Korol on 7/31/2018
 */
public class Worker {
    private Human human;
    private double salary;
    public String company;

    public Worker(String name, int age) {
        human = new Human(false);
    }

    public void live() {
        human.live();
    }

    public double getSalary() {
        return salary;
    }

    public void setSlr(double salary) {
        this.salary = salary;
    }
}
