package Day26.Cat.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三", 20, "男"));
        list.add(new Person("李四", 23, "男"));
        list.add(new Person("王五", 26, "男"));
        list.add(new Person("丽丽", 27, "女"));
        list.add(new Person("思思", 25, "女"));
        add(list);
        sort(list);
    }

    public static void add(ArrayList<Person> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入性别");
        String sex = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getName()) && age == list.get(i).getAge() && sex.equals(list.get(i).getSex())) {
                System.out.println("此信息已存在");
                break;
            }

        }
        list.add(new Person(name, age, sex));


    }

    public static void sort(ArrayList<Person> list) {
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getName().compareTo(o2.getName()) > 0) {
                    return 1;
                } else if (o1.getName().compareTo(o2.getName()) > 0) {
                    return -1;

                } else {
                    return o1.getAge() - o2.getAge();


                }

            }


        });System.out.println(list.toString());




    }
}

