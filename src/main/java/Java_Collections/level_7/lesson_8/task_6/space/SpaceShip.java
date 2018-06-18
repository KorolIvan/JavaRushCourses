package Java_Collections.level_7.lesson_8.task_6.space;

import Java_Collections.level_7.lesson_8.task_6.space.crew.*;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class SpaceShip {
    public AbstractCrewMember getCrewChain(){
        AbstractCrewMember cabinBoy = new CabinBoy(AbstractCrewMember.CompetencyLevel.NOVICE);
        AbstractCrewMember engineer = new Engineer(AbstractCrewMember.CompetencyLevel.INTERMEDIATE);
        AbstractCrewMember firstMate = new FirstMate(AbstractCrewMember.CompetencyLevel.ADVANCED);
        AbstractCrewMember captain = new Captain(AbstractCrewMember.CompetencyLevel.EXPERT);

        cabinBoy.setNextCrewMember(engineer);
        engineer.setNextCrewMember(firstMate);
        firstMate.setNextCrewMember(captain);

        return cabinBoy;
    }
}

