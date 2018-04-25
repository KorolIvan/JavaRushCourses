package java_core.level_16.lesson_5;

public class Task_3 {
    public static int totalCountSpeeches = 200;
    public static int soundsInOneSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException {
        Politician ivanov = new Politician("Иванов");
        Politician petrov = new Politician("Петров");
        ivanov.join();
        Politician sidorov = new Politician("Сидоров");


        while (ivanov.getCountSpeeches() + petrov.getCountSpeeches() + sidorov.getCountSpeeches() < totalCountSpeeches) {
        }

        System.out.println(ivanov);
        System.out.println(petrov);
        System.out.println(sidorov);
    }

    public static class Politician extends Thread {
        private volatile int countSounds;

        public Politician(String name) {
            super(name);
            start();
        }

        public void run() {
            while (countSounds < totalCountSpeeches * soundsInOneSpeech) {
                countSounds++;
            }
        }

        public int getCountSpeeches() {
            return countSounds / soundsInOneSpeech;
        }

        @Override
        public String toString() {
            return String.format("%s сказал речь %d раз", getName(), getCountSpeeches());
        }
    }
}
