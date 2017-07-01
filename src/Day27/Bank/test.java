package Day27.Bank;

/**
 * Created by Administrator on 2017/6/28.
 */
public class test {
    public static void main(String[] args) {
        Account account=new Account("xxxxx",0);
        Drawer td1=new Drawer("甲",account,800);
        Save td2=new Save("乙",account,800);
        td1.start();
        td2.start();

    }
}
