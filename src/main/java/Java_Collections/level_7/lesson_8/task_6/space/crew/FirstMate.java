package Java_Collections.level_7.lesson_8.task_6.space.crew;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class FirstMate extends AbstractCrewMember {
    public FirstMate (AbstractCrewMember.CompetencyLevel competencyLevel) {
        this.competencyLevel = competencyLevel;
    }

    protected void doTheJob(String request) {
        System.out.println("The request " + request + " will be handled by first mate, let's not bother the captain with it.");
    }
}

