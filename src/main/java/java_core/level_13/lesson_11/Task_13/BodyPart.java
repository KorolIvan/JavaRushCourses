package java_core.level_13.lesson_11.Task_13;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public final class BodyPart {
    final static level_13.lesson_11.Task_13.BodyPart LEG = new level_13.lesson_11.Task_13.BodyPart("нога");
    final static level_13.lesson_11.Task_13.BodyPart HEAD = new level_13.lesson_11.Task_13.BodyPart("голова");
    final static level_13.lesson_11.Task_13.BodyPart ARM = new level_13.lesson_11.Task_13.BodyPart("рука");
    final static level_13.lesson_11.Task_13.BodyPart CHEST = new level_13.lesson_11.Task_13.BodyPart("грудь");

    private String bodyPart;

    private BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }
}
