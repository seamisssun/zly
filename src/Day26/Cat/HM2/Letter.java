package Day26.Cat.HM2;

/**
 * Created by Administrator on 2017/6/28.
 */
public class Letter extends Thread {
    private Printer printer;

    public Letter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for(char i='A';i<'Z';i++){
            printer.printChar(i);
        }
    }
}
