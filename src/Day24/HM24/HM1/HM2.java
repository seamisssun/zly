package Day24.HM24.HM1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/23.
 */
public class HM2 {
    public static void main(String[] args) {


        File file = new File("G:\\xue\\java练习");
        File file1 = new File("G:\\456");
        ArrayList<File> list = new ArrayList<>();
        getFiles(file, list);
        search(file1, list);

    }

    private static void getFiles(File file, ArrayList<File> list) {

        if (file == null || file.isFile()) {
            return;
        }
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                if (f.getAbsolutePath().endsWith(".java")) {
                    list.add(f);

                }

            } else {
                getFiles(f, list);
            }
        }
    }

    public static void search(File file, List<File> list) {
        BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            for (File f : list) {
                bw.write(f.getAbsolutePath());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}


