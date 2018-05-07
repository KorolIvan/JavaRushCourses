package Java_Collections.level_1.lesson_2.task_3;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.FileVisitResult.CONTINUE;

/**
 * @author Ivan Korol on 5/7/2018
 */
public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private List<Path> foundFiles = new ArrayList<>();

    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;


    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        boolean isTrue = true;

        if (partOfName != null) {
            if (!file.getFileName().toString().contains(partOfName)) {
                isTrue = false;
            }
        }

        if (partOfContent != null) {
            if (!new String(Files.readAllBytes(file)).contains(partOfContent)) {
                isTrue = false;
            }
        }

        if (maxSize != 0) {
            if (Files.size(file) > maxSize) {
                isTrue = false;
            }
        }

        if (minSize != 0) {
            if (Files.size(file) < minSize) {
                isTrue = false;
            }
        }

        if (isTrue) foundFiles.add(file);

        return FileVisitResult.CONTINUE;
    }



    public List<Path> getFoundFiles() {

        return this.foundFiles;
    }
}
