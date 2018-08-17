package java_multithreading.level_8.HTMLEditor;

import java_multithreading.level_8.HTMLEditor.listeners.FrameListener;
import java_multithreading.level_8.HTMLEditor.listeners.TabbedPaneChangeListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Ivan Korol on 8/16/2018
 */
public class View extends JFrame implements ActionListener {
    private Controller controller;
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane = new JEditorPane();

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void init() {
        initGui();
        FrameListener frameListener = new FrameListener(this);
        addWindowListener(frameListener);
        setVisible(true);
    }

    public void initMenuBar() {

    }

    public void initEditor() {
       htmlTextPane.setContentType("text/html");
       tabbedPane.addTab("HTML", new JScrollPane(htmlTextPane));
       tabbedPane.addTab("Текст", new JScrollPane(plainTextPane));
       tabbedPane.setPreferredSize(new Dimension(800, 600));
       tabbedPane.addChangeListener(new TabbedPaneChangeListener(this));
       getContentPane().add(tabbedPane, BorderLayout.CENTER);
    }

    public void initGui() {
        initMenuBar();
        initEditor();
        pack();
    }

    public void selectedTabChanged() {

    }

    public void exit() {
        controller.exit();
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
