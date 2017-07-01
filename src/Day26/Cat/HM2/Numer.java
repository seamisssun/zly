package Day26.Cat.HM2;

/**
 * Created by Administrator on 2017/6/28.
 */
public class Numer extends Thread {
    private Printer printer;

    public Numer(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for(int i=1;i<53;i+=2){
            printer.printNum(i);
        }
    }
}
