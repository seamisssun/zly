package Day24.Person;

import Day20.Person.*;

import java.util.*;

/**
 * Created by Administrator on 2017/6/23.
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Person>per=new ArrayList<>();
        per.add(new Person("zhangsan",20,"男"));
        per.add(new Person("lisi",18,"男"));
        per.add(new Person("wangwu",19,"男"));
        per.add(new Person("lili",18,"女"));
        per.add(new Person("weiwei", 20, "女"));
        add(per);
        sort(per);

    }
        public static void add(ArrayList<Person>per){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入名字");
        String name=sc.next();
        System.out.println("请输入年龄");
        int age=sc.nextInt();
        System.out.println("请输入性别");
        String sex=sc.next();
        for(int i=0;i<per.size();i++) {
            if (name.equals(per.get(i).getName()) && age == per.get(i).getAge() && sex.equals(per.get(i).getSex())) {
                System.out.println("此条信息已存在");
                break;
            }



        } per.add(new Person(name, age, sex));
            System.out.println(per.toString());
    }
    public static void sort(ArrayList<Person>per){
        Collections.sort(per, new Comparator<Person>() {
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
        });
        System.out.println(per.toString());

        }

    }



