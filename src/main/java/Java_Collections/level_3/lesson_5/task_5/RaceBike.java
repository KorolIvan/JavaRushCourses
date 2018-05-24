package Java_Collections.level_3.lesson_5.task_5;

/**
 * @author Ivan Korol on 5/24/2018
 */
public class RaceBike extends Motorbike {
    private String owner;
    private int age;

    public RaceBike(String name, String owner, int age) {
        super(name);
        this.owner = owner;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "RaceBike{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", age=" + age +
                '}';
    }
}
