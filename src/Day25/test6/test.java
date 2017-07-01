package Day25.test6;

import Day25.test5.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Administrator on 2017/6/25.
 */
public class test {
    public static void main(String[] args) {
        ArrayList<Person>list=new ArrayList<>();
        list.add(new Person(1,"张三",25));
        list.add(new Person(2, "李四", 23));
        list.add(new Person(3, "丽丽", 20));
        list.add(new Person(3, "帅帅", 28));

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() - o2.getAge() > 0) {
                    return 1;
                } else if (o1.getAge() - o2.getAge() < 0) {
                    return -1;
                } else {
                    return o1.getName().compareTo(o2.getName());
                }

            }
        });
        System.out.println(list.toString());
        System.out.println("年龄最大的学生是："+list.get(list.size() - 1));
        }

}
