package Day26.Cat;

/**
 * Created by Administrator on 2017/6/27.
 */
public class C extends Thread{
    public void run(){
        int i=0;
        while (true){
            try {
                Thread.sleep(1000);
                if(i%4==0){
                    System.out.println("*****");
                }i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
