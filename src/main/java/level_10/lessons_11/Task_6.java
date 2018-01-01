package level_10.lessons_11;

public class Task_6 {
    public static void main(String[] args) {
    }

    public static class Human {
        private String firstName;
        private String lastName;
        private String hoddy;
        private String sureName;
        private int age;
        private boolean sport;

        public Human(String firstName, String lastName, String hoddy) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.hoddy = hoddy;
        }

        public Human(String sureName, int age) {
            this.sureName = sureName;
            this.age = age;
        }

        public Human(String lastName, boolean sport) {
            this.lastName = lastName;
            this.sport = sport;
        }

        public Human(String sureName, int age, boolean sport) {
            this.sureName = sureName;
            this.age = age;
            this.sport = sport;
        }

        public Human(int age, boolean sport) {
            this.age = age;
            this.sport = sport;
        }

        public Human(String firstName, String lastName, String hoddy, String sureName, int age, boolean sport) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.hoddy = hoddy;
            this.sureName = sureName;
            this.age = age;
            this.sport = sport;
        }

        public Human(String firstName, String lastName, String hoddy, String sureName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.hoddy = hoddy;
            this.sureName = sureName;
            this.age = age;
        }

        public Human(String firstName, String lastName, String hoddy, String sureName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.hoddy = hoddy;
            this.sureName = sureName;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human() {
        }

        // напишите тут ваши переменные и конструкторы
    }
}
