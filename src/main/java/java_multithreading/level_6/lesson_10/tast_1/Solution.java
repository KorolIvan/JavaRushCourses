package java_multithreading.level_6.lesson_10.tast_1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Ivan Korol on 8/3/2018
 */
public class Solution {
    private Lock lock = new ReentrantLock();

    public void someMethod() {
        //implement logic here, use the lock field
        if(lock.tryLock()){
            try{
                ifLockIsFree();
            }finally {
                lock.unlock();
            }
        }else {
            ifLockIsBusy();
        }
    }

    public void ifLockIsFree() {
    }

    public void ifLockIsBusy() {
    }
}
