package java_multithreading.level_8.HTMLEditor;

import javax.swing.text.html.HTMLDocument;
import java.io.File;

/**
 * @author Ivan Korol on 8/16/2018
 */
public class Controller {
    private View view;
    private HTMLDocument document;
    private File currentFile;

    public Controller(View view) {
        this.view = view;
    }

    public static void main(String[] args) {

    }
}
