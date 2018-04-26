package java_core.level_16.lesson_13.task_11;


import java_core.level_16.lesson_13.task_11.common.*;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes pic) throws IllegalArgumentException{
        try {
            String s = pic.toString();
            if(s.contains("jpg")||s.contains("JPG")||s.contains("Jpg")){
                return new JpgReader();
            }else if(s.contains("bmp")||s.contains("BMP")||s.contains("Bmp")){
                return new BmpReader();
            }else if(s.contains("png")||s.contains("PNG")||s.contains("Png")) {
                return new PngReader();
            }

        }catch (IllegalArgumentException e) {

        } catch (NullPointerException n){

        }
        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
