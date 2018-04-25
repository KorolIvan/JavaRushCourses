package java_core.level_13.lesson_11.Task_13;

import level_13.lesson_11.Task_13.Attackable;
import level_13.lesson_11.Task_13.BodyPart;
import level_13.lesson_11.Task_13.Defensable;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public abstract class AbstractRobot implements Attackable, Defensable{
    private static int hitCount = (int) Math.random()*4;

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount +=  1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            //hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        } else {
            attackedBodyPart = BodyPart.CHEST;
        }
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defencedBodyPart = null;
        //hitCount += 2;

        if (hitCount == 1) {
            defencedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defencedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            //hitCount = 0;
            defencedBodyPart = BodyPart.ARM;
        }else {

            defencedBodyPart = BodyPart.CHEST;
        }
        return defencedBodyPart;
    }

    public String getName() {
        return getName();
    }
}
