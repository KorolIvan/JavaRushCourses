package Java_Collections.level_5.lesson_6.task_1;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author Ivan Korol on 6/11/2018
 */
public class Solution<T extends HashMap> {
    private HashMap map;

    public Solution(HashMap map) {
        this.map = map;
    }

    public HashMap getMap() {
        return map;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("string", 4);
        Solution solution = new Solution(hashMap);
        HashMap mapFromSolution = solution.getMap();
        System.out.println(mapFromSolution.getClass());


        LinkedHashMap<Solution, Solution> hashMap2 = new LinkedHashMap<>();
        hashMap2.put(solution, solution);
        Solution solution2 = new Solution(hashMap2);
        LinkedHashMap mapFromSolution2 = (LinkedHashMap)solution2.getMap();   //need to cast  :(
        System.out.println(mapFromSolution2.getClass());
    }
}
