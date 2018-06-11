package Java_Collections.level_5.lesson_8.task_1;

/**
 * @author Ivan Korol on 6/11/2018
 */
public class ConvertableUser implements Convertable<Integer> {
    private Integer id;
    private String name;

    public ConvertableUser(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Integer getKey() {
        return id;
    }

    @Override
    public String toString() {
        return "ConvertableUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
