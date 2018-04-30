package java_core.level_20.lesson_4.task_1;

/**
 * @author Ivan Korol on 4/30/2018
 */
public class Asset {
    public Asset(String name) {
        this.name = name;
    }

    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
