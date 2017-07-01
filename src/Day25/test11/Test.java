package Day25.test11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Administrator on 2017/6/26.
 */
public class Test {
    public static void main(String[] args) {
        Cat cat=new Cat(5,"小花",4,"晒太阳");
        System.out.println(cat.toString());
        ArrayList<Cat>cats=new ArrayList<>();
        cats.add(new Cat(1,	"招财",	2,"玩毛线"));
        cats.add(new Cat(2,"进宝", 3,"睡觉"));
        cats.add(new Cat(3,"如意", 2	,"钻沙发"));
        cats.add(new Cat(4, "狗蛋", 1, "找吃的"));
        Collections.sort(cats, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                if(o1.getAge()-o2.getAge()>0){
                    return 1;
                }else if(o1.getAge()-o2.getAge()<0){
                    return -1;
                }else{
                    return o1.getId()-o2.getId();
                }
            }
        });
        for(Cat cat1:cats){
            System.out.println(cat1.getId()+"  "+cat1.getName()+" "+cat1.getAge()+" "+cat1.getHabit());
        }


    }
}
