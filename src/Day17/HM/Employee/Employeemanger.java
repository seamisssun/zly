package Day17.HM.Employee;

import Day16.HM16.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Employeemanger {
    Scanner sc = new Scanner(System.in);

    public void add(ArrayList<Employee> employee) {
        System.out.println("请输入ID");
        int id = sc.nextInt();
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入性别");
        String sex = sc.next();
        System.out.println("请输入出生年月");
        String birthday = sc.next();
        System.out.println("请输入工作年限");
        int workage = sc.nextInt();
        System.out.println("请输入学历");
        String education = sc.next();
        System.out.println("请输入职务");
        String job = sc.next();
        System.out.println("请输入住址");
        String address = sc.next();
        System.out.println("请输入电话");
        int phone = sc.nextInt();
        for (int i = 0; i < employee.size(); i++) {
            if (id == employee.get(i).getId()) {
                System.out.println("此ID已存在");
            }
        }
        employee.add(new Employee(address, birthday, education, id, job, name, phone, sex, workage));
        System.out.println("输入成功");
    }

    public void del(ArrayList<Employee> employee) {
        System.out.println("请输入要删除的员工姓名");
        String name = sc.next();
        int index = -1;
        for (int i = 0; i < employee.size(); i++) {
            if (name.equals(employee.get(i).getName())) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("未找到要删除的数据");
        } else {
            employee.remove(index);
        }

    }

    public int find(ArrayList<Employee> employee) {
        System.out.println("请输入要查找的职工姓名");
        String name = sc.next();
        employee.indexOf(name);

    }


}
