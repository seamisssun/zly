package Day26.Cat.Bank;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Drawer extends Thread {
    private Bank bank;
    private int money;

    public Drawer(String name, Bank bank, int money) {
        super(name);
        this.bank = bank;
        this.money = money;
    }

    public void run() {
        synchronized (bank) {
            if (bank.getBalance() - money >= 0) try {
                Thread.sleep(1000);
                bank.setBalance(bank.getBalance() - money);
                System.out.println("余额" + (bank.getBalance() - money));
                System.out.println(getName() + " " + money);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            else {
                System.out.println("余额不足");
                System.out.println("取钱失败");
            }
        }
    }
}