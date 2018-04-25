package java_core.level_17.lesson_4.task_4;

import level_17.lesson_4.task_4.OurPresident;

public class Solution {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident );
    }
}
