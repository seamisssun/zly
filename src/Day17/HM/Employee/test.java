package Day17.HM.Employee;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/13.
 */
public class test {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
     ArrayList<Employee>employee=new ArrayList<Employee>();
        Employeemanger emp=new Employeemanger();
        while (true){
            System.out.println("1 新增");
            System.out.println("2 删除");
            System.out.println("3 查询");
            System.out.println("4 修改");
            System.out.println("5 排序");
            System.out.println("6 退出");
            System.out.println("请选择");
            String key=sc.next();
            switch(key){
                case  "1":
                    break;
                case "2":

                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    return;    }
        }
    }
}
