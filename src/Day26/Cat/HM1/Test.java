package Day26.Cat.HM1;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Test {
    public static void main(String[] args) {
        Hole hole=new Hole();
        new Train("火车1",hole).start();
        new Train("火车2",hole).start();
        new Train("火车3",hole).start();
        new Train("火车4",hole).start();
        new Train("火车5",hole).start();
    }
}
