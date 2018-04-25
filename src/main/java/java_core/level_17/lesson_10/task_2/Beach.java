package java_core.level_17.lesson_10.task_2;

public class Beach implements Comparable<level_17.lesson_10.task_2.Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

    }

    @Override
    public synchronized int compareTo(level_17.lesson_10.task_2.Beach o) {
        //int temp = 0;
        return (int) ((this.quality * this.distance) - (o.getDistance() * o.getQuality()));

        //return temp;
    }
}
