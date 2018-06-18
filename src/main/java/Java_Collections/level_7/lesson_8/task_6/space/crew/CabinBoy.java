package Java_Collections.level_7.lesson_8.task_6.space.crew;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class CabinBoy extends AbstractCrewMember {
    public CabinBoy (AbstractCrewMember.CompetencyLevel competencyLevel) {
        this.competencyLevel = competencyLevel;
    }

    protected void doTheJob(String request) {
        System.out.println("Even the cabin boy can handle the request " + request);
    }
}
