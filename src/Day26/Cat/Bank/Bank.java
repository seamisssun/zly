package Day26.Cat.Bank;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Bank extends Thread{
    private String ID;
    private int balance;

    public Bank(String ID, int balance) {
        this.ID = ID;
        this.balance = balance;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
