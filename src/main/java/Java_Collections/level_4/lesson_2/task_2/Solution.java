package Java_Collections.level_4.lesson_2.task_2;

/**
 * @author Ivan Korol on 5/31/2018
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.factorial(9));     //362880
        System.out.println(solution.factorial(0));     //1
        System.out.println(solution.factorial(1));     //1
    }

    public int factorial(int n) {
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
