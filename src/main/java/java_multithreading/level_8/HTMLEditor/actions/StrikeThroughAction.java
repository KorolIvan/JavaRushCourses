package java_multithreading.level_8.HTMLEditor.actions;

import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

/**
 * @author Ivan Korol on 8/17/2018
 */
public class StrikeThroughAction extends StyledEditorKit.StyledTextAction {

    public StrikeThroughAction() {
        super("Зачеркнутый");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
