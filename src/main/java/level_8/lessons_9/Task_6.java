package level_8.lessons_9;

import java.util.ArrayList;

public class Task_6 {

    public static void main(String[] args) {
        Human child1=new Human("Child_1", true, 5, new ArrayList<Human>());
        Human child2= new Human("Child_2",true, 7, new ArrayList<Human>());
        Human child3= new Human("Child_3" , false,4, new ArrayList<Human>());
        ArrayList<Human> children3= new ArrayList<Human>();
        children3.add(child1);
        children3.add(child2);
        children3.add(child3);


        Human father= new Human("Dad",true, 36, children3);
        Human mother=new Human("Mom",false,32,children3);

        ArrayList<Human> fath = new ArrayList<Human>();
        fath.add(father);

        ArrayList<Human> mom = new ArrayList<Human>();
        mom.add(mother);

        Human grendDad_1 = new Human("Grand_Dad_1",true, 63, fath);
        Human grendMom_1 = new Human("Grand_Mom_1",false,57, fath);

        Human grendDad_2 = new Human("Grand_Dad_2",true, 66, mom);
        Human grendMom_2 = new Human("Grand_Mom_2",false,55, mom);
        ArrayList<Human> children=new ArrayList<Human>();
        children.add(father);
        ArrayList<Human> children2= new ArrayList<Human>();
        children2.add(mother);
        //напишите тут ваш код
        System.out.println(grendDad_1 + "\n"
                + grendMom_1 + "\n"
                + grendDad_2 + "\n"
                + grendMom_2 + "\n"
                + father + "\n"
                + mother + "\n"
                + child1 + "\n"
                + child2 + "\n"
                + child3
        );

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = null;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
