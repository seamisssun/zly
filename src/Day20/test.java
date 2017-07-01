package Day20;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/15.
 */
public class test {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("张三");
        a.add("李四");
        a.add("王五");
        a.add("张三");
        a.add("aaa");
        a.add("aaa");
        a.add("bbb");
        a.remove(3);
        a.remove(4);
        System.out.println(a);
    }
}
