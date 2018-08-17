package java_multithreading.level_8.HTMLEditor.listeners;

import java_multithreading.level_8.HTMLEditor.View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Ivan Korol on 8/17/2018
 */
public class FrameListener extends WindowAdapter {
    private View view;

    public FrameListener(View view) {
        this.view = view;
    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        //super.windowClosing(e);
        view.exit();
    }
}
