package Day16.HM16;


import java.util.*;

/**
 * Created by Administrator on 2017/6/9.
 */
public class StudentManager {
    Scanner sc = new Scanner(System.in);

    public void init(ArrayList<Student> students) {
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入ID");
        int id = sc.nextInt();
        System.out.println("请输入名字");
        String name = sc.next();
        System.out.println("请输入性别");
        String sex = sc.next();

        for (int i = 0; i < students.size(); i++) {
            if (id == (students.get(i).getId())) {
                System.out.println("此id存在");
                return;
            } else if (name == null) {
                System.out.println("名字不能为空");
                return;

            } else if (sex.length()!=1) {
                System.out.println("性别必须为单个字符");
                return;
            } else if (!(age > 0 && age < 100)) {
                System.out.println("年龄必须为0-100");
                return;
            }

        }
        students.add(new Student(age, id, name, sex));

        System.out.println("输入成功");




    }

    public void print(ArrayList<Student> students) {
        for (Student stu : students) {
            System.out.println(stu.toString());
        }
    }

    public int find(ArrayList<Student> students, String name) {
        // System.out.println("请输入要查找的学生姓名");
        //String name = sc.next();
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (name.equals(students.get(i).getName())) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void mod(ArrayList<Student> students) {

        System.out.println("请输入要修改的学生姓名");
        String name = sc.next();
        int index = find(students, name);
        if (index == -1) {
            System.out.println("未找到要修改的学生");
        } else {
            Student stu = students.get(index);
            System.out.println("请重新输入年龄，ID，名字，性别");
            int age1 = sc.nextInt();
            int id1 = sc.nextInt();
            String name1 = sc.next();
            String sex1 = sc.next();
            if (stu.getAge() != age1) {
                stu.setAge(age1);
            }
            if (stu.getId() != id1) {
                stu.setId(id1);
            }
            if (stu.getName().equals(name1)) {
                stu.setName(name1);
            }
            if (stu.getSex() != sex1) {
                stu.setSex(sex1);
            }
        }
    }

    public void sort(ArrayList<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student arg0, Student arg1) {
                return arg0.getAge() - arg1.getAge();
            }
        });
        for (Student stu : students) {
            System.out.println(stu.toString());
        }
    }



        }
