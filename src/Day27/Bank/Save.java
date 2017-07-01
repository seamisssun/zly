package Day27.Bank;

/**
 * Created by Administrator on 2017/6/28.
 */
public class Save extends Thread {
    private Account account;
    private int money;

    public Save(String name, Account account, int money) {
        super(name);
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        for (int i=0;i<6;i++){
            account.saveMoney(money);
        }

    }

}
