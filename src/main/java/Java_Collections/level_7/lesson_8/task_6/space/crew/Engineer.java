package Java_Collections.level_7.lesson_8.task_6.space.crew;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class Engineer extends AbstractCrewMember {
    public Engineer (AbstractCrewMember.CompetencyLevel competencyLevel) {
        this.competencyLevel = competencyLevel;
    }

    protected void doTheJob(String request) {
        System.out.println(request + " is a common engineering task. To the work!");
    }
}
