package Day16.HM16;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/9.
 */
public class Test {
    public static void main(String[] args) {


     ArrayList<Student> students=new ArrayList<Student>();
     ArrayList<Student> students1=new ArrayList<Student>();
    Scanner sc=new Scanner(System.in);
    StudentManager stu=new StudentManager();
    while(true){
        System.out.println("1 添加信息");
        System.out.println("2 遍历打印");
        System.out.println("3 按姓名查找后修改");
        System.out.println("4 按年龄降序排列");
        System.out.println("5 退出");
        System.out.println("请选择");
        String key=sc.next();
    switch(key){
        case  "1":stu.init(students);
            break;
        case "2":stu.print(students);
           // System.out.println(students.size());
            break;
        case "3":stu.mod(students);
            break;
        case "4":stu.sort(students);
            break;
        case "5":
            return;    }
    }

}
}