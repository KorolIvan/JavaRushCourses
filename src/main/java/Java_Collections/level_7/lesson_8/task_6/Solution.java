package Java_Collections.level_7.lesson_8.task_6;

import Java_Collections.level_7.lesson_8.task_6.space.SpaceShip;
import Java_Collections.level_7.lesson_8.task_6.space.crew.AbstractCrewMember;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class Solution {
    public static void main(String[] args) {
        SpaceShip spaceShip = new SpaceShip();
        AbstractCrewMember crewMember = spaceShip.getCrewChain();

        crewMember.handleRequest(AbstractCrewMember.CompetencyLevel.EXPERT, "ATTACK");
        System.out.println("-----------------------------------------");
        crewMember.handleRequest(AbstractCrewMember.CompetencyLevel.NOVICE, "WASH THE FLOOR");
        System.out.println("-----------------------------------------");
        crewMember.handleRequest(AbstractCrewMember.CompetencyLevel.INTERMEDIATE, "CHECK ENGINE");
        System.out.println("-----------------------------------------");
        crewMember.handleRequest(AbstractCrewMember.CompetencyLevel.ADVANCED, "SET ROUTE");
    }
}
