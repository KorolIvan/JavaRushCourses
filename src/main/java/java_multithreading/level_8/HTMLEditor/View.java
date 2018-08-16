package java_multithreading.level_8.HTMLEditor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Ivan Korol on 8/16/2018
 */
public class View extends JFrame implements ActionListener {
    private Controller controller;
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
