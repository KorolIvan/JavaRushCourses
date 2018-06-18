package Java_Collections.level_7.lesson_8.task_6.space.crew;

/**
 * @author Ivan Korol on 6/18/2018
 */
public class Captain extends AbstractCrewMember {
    public Captain (AbstractCrewMember.CompetencyLevel competencyLevel) {
        this.competencyLevel = competencyLevel;
    }

    protected void doTheJob(String request) {
        System.out.println("Only the captain can handle request " + request + ". Let's do this!");
    }
}
