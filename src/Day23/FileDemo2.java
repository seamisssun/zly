package Day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by Administrator on 2017/6/22.
 */
public class FileDemo2 {
    public static void main(String[] args) {

    }
    public static void copyfile() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("G:\\1.mp3");
            fos = new FileOutputStream("G:\\2.mp3");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
