package java_multithreading.level_8.HTMLEditor.listeners;

import java_multithreading.level_8.HTMLEditor.View;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * @author Ivan Korol on 8/17/2018
 */
public class TabbedPaneChangeListener implements ChangeListener {
    private View view;

    public TabbedPaneChangeListener(View view) {
        this.view = view;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        view.selectedTabChanged();
    }
}
