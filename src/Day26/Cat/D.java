package Day26.Cat;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/27.
 */
public class D extends Thread {
    public void run(){
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println(new Date());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
