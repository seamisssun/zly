package Day25.test7;

import java.io.*;

/**
 * Created by Administrator on 2017/6/26.
 */
public class Test11 {
    public static void main(String[] args) throws FileNotFoundException {
        String a = "dasdad";
        File file = new File("data/goods.data");
        try {

            DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
            out.write(a.getBytes());

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
