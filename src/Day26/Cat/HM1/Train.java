package Day26.Cat.HM1;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Train extends Thread {
    private Hole hole;

    public Train(String name, Hole hole) {
        super(name);
        this.hole = hole;
    }

    @Override
    public void run() {
        synchronized (hole) {
            try {
                Thread.sleep(2000);
                System.out.println(getName() + "通过山洞");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}