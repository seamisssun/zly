package Day27.Bank;

/**
 * Created by Administrator on 2017/6/28.
 */
public class Drawer extends Thread {
    private Account account;
    private int money;

    public Drawer(String name, Account account, int money) {
        super(name);
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        for(int i=0;i<6;i++){
            account.drawMoney(money);
        }
    }
}
