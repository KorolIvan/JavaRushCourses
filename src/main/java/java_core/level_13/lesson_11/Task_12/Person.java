package java_core.level_13.lesson_11.Task_12;


/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class Person implements RepkaItem{
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePadezh() {
        return namePadezh;
    }

    public void setNamePadezh(String namePadezh) {
        this.namePadezh = namePadezh;
    }

    public void pull(Person person) {
        //System.out.println(person.getName() + " за " + person.getNamePadezh());
        System.out.println(this.name + " за " + person.namePadezh);
    }
}
