package Day25.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/24.
 */
public class test {
    public static void main(String[] args) {
        ArrayList<Student> stu = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入ID");
            int id = sc.nextInt();

            int index = -1;
            for (int i = 0; i < stu.size(); i++) {
                if (id == stu.get(i).getId()) {
                    index = i;

                }
            }
            if (index == -1) {
                System.out.println("请输入名字");
                String name = sc.next();
                stu.add(new Student(id, name));
            } else {
                System.out.println("此ID重复");

            }
            System.out.println("请选择是否继续输入（y/n）");
            String a = sc.next();
            if (a.equals("n")) {
                for (Student student : stu) {
                    System.out.println(student.toString());

                }print(stu);
                break;
            }
        }



    }
    public static void print(ArrayList<Student> stu){
        Collections.sort(stu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });

    }

}






