package level_8.lessons_9;

import java.util.ArrayList;

public class Task_6 {
    //todo check this issue & compleat
    public static void main(String[] args) {
        Human child1=new Human("Alex", true, 5);
        Human child2= new Human("Andrew",true, 7);
        Human child3= new Human("Lena" , false,4);
        ArrayList<Human> children3= new ArrayList<Human>();
        children3.add(child1);
        children3.add(child2);
        children3.add(child3);


        Human father= new Human("Alexei",true, 36, children3);
        Human mother=new Human("Natalia",false,32,children3);

        ArrayList<Human> fath = new ArrayList<Human>();
        fath.add(father);

        ArrayList<Human> mom = new ArrayList<Human>();
        mom.add(mother);

        Human grendDad_1 = new Human("Alexei",true, 63, fath);
        Human grendMom_1 = new Human("Natalia",false,57, fath);

        Human grendDad_2 = new Human("Alexei",true, 66, mom);
        Human grendMom_2 = new Human("Natalia",false,55, mom);
        ArrayList<Human> children=new ArrayList<Human>();
        children.add(father);
        ArrayList<Human> children2= new ArrayList<Human>();
        children2.add(mother);
        //напишите тут ваш код
        System.out.println(grendDad_1 + "\n" + grendMom_1 +"\n"+ grendDad_2 + "\n" + grendMom_2 + "\n"+father +"\n"+ mother);
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

        public Human(String name, boolean sex, int age) {

            this.name = name;
            this.sex = sex;
            this.age = age;
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
