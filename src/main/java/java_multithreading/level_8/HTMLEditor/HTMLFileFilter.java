package java_multithreading.level_8.HTMLEditor;

import javax.swing.filechooser.FileFilter;
import java.io.File;

/**
 * @author Ivan Korol on 8/22/2018
 */
public class HTMLFileFilter extends FileFilter {
    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        else if (!f.isDirectory()) {
            String fileName = f.getName().toLowerCase();
            return fileName.endsWith(".html") || fileName.endsWith(".htm");
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "HTML и HTM файлы";
    }
}
