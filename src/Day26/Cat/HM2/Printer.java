package Day26.Cat.HM2;

/**
 * Created by Administrator on 2017/6/28.
 */
public class Printer {
    private boolean flag=false;

    public synchronized void printNum(int num) {
        if(flag){
            try {
                wait();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(num++);
        System.out.println(num);
        flag=true;
        notifyAll();

    }
    public synchronized void printChar(char c){
        if(!flag){
            try {wait();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(c);
        flag=false;
        notifyAll();

    }
}
