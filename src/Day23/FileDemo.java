package Day23;

import java.io.File;

/**
 * Created by Administrator on 2017/6/22.
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("G:\\xue\\java练习");
        foundjava(file);
    }

    public static void foundjava(File file) {

        if (file == null || file.isFile()) {
            return;
        }
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                foundjava(f);
            } else {
                if (f.getName().endsWith(".java")) {
                    System.out.println(f.getName());
                }
            }
        }
    }

}
