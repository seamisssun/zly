package Day26.Cat.cat;

import Day26.Cat.cat.CanCry;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Cat implements CanCry {

    @Override
    public void cry() {
        System.out.println("我是猫，我的叫声是喵喵喵");
    }
}