package level_8.lessons_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (min > array.get(i)){
                min = array.get(i);
            }
        }
        // find minimum here — найти минимум тут
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = new ArrayList<Integer>();
        int N = Integer.parseInt(reader.readLine());
        for(int i = 0; i < N; i++){
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        //create and initialize a list here - создать и заполнить список тут
        return numbers;
    }
}
