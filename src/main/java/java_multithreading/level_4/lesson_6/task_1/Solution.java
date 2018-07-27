package java_multithreading.level_4.lesson_6.task_1;

import java.util.List;

/**
 * @author Ivan Korol on 7/27/2018
 */
public class Solution {
    public static void main(String[] args) {
        List<Pet> pet = Util.getPets();
        List<Sayable> pets = Util.convertPetToSayable(pet);
        Util.printDialog(pets);
    }
}

