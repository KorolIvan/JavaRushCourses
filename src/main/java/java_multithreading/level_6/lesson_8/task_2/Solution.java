package java_multithreading.level_6.lesson_8.task_2;

/**
 * @author Ivan Korol on 8/3/2018
 */
public class Solution {
    int var1;
    int var2;
    int var3;
    int var4;

    public Solution(int var1, int var2, int var3, int var4) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }

    public int getSumOfVar1AndVar2() {
        synchronized (Solution.class){
            return var1 + var2;
        }
    }

    public int getSumOfVar3AndVar4() {
        synchronized (this){
            return var3 + var4;
        }
    }

    public static void main(String[] args) {

    }
}
