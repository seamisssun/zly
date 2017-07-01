package Day26.Cat.Bank;

/**
 * Created by Administrator on 2017/6/27.
 */
public class test {
    public static void main(String[] args) {
        Bank bank=new Bank("****",2000);
        Drawer td1=new Drawer("甲",bank,1200);
        Drawer td2=new Drawer("乙",bank,1000);
        td1.start();
        td2.start();
    }
}
