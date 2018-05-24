package Java_Collections.level_3.lesson_5.task_5;

/**
 * @author Ivan Korol on 5/24/2018
 */
public class Motorbike extends Auto {
    private String owner;

    public Motorbike(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
