package java_multithreading.level_8.HTMLEditor.actions;

import java_multithreading.level_8.HTMLEditor.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author Ivan Korol on 8/17/2018
 */
public class UndoAction extends AbstractAction {
    private View view;

    public UndoAction(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.undo();
    }
}
