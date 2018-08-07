package java_multithreading.level_7.archiver;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author Ivan Korol on 8/7/2018
 */
public class ZipFileManager {
    private Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }

    public void createZip(Path source) throws Exception {
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile));
             InputStream inputStream = Files.newInputStream(source)) {
            ZipEntry sourceEntry = new ZipEntry(source.getFileName().toString());
            zipOutputStream.putNextEntry(sourceEntry);
            //Считываем содержимое файла в массив byte
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            //Добавляем содержимое к архиву
            zipOutputStream.write(buffer);
            //Закрываем текущую запись для новой записи
            zipOutputStream.closeEntry();
        }
    }
}
