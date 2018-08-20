package java_multithreading.level_8.HTMLEditor.actions;

import javax.swing.*;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import java.awt.event.ActionEvent;

/**
 * @author Ivan Korol on 8/17/2018
 */
public class SubscriptAction extends StyledEditorKit.StyledTextAction {

    public SubscriptAction() {
        super(StyleConstants.Subscript.toString());
        //super("Подстрочный знак");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JEditorPane editorPane = getEditor(e);
        if(editorPane != null) {
            MutableAttributeSet mutableAttributeSet = getStyledEditorKit(editorPane).getInputAttributes();
            SimpleAttributeSet simpleAttributeSet = new SimpleAttributeSet();
            StyleConstants.setSubscript(simpleAttributeSet, !StyleConstants.isSubscript(mutableAttributeSet));
            setCharacterAttributes(editorPane, simpleAttributeSet, false);
        }
    }
}
