package java_multithreading.level_8.HTMLEditor.listeners;

import java_multithreading.level_8.HTMLEditor.View;

import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 * @author Ivan Korol on 8/17/2018
 */
public class TextEditMenuListener implements MenuListener {
    private View view;

    public TextEditMenuListener(View view) {
        this.view = view;
    }

    @Override
    public void menuSelected(MenuEvent e) {

    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}
