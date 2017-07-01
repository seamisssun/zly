package Day20.Person;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by Administrator on 2017/6/15.
 */
public class test {
    public static void main(String[] args) {
        Person Student=new Student(20,"张三",001,100);
        Person Teacher=new Teacher(30,"豪哥","高级");
        System.out.println("学员"+Student.toString());
        System.out.println("老师" + Teacher.toString());
        LinkedList<Student> student=new LinkedList<>();
        student.add(new Student(25,"李四",003,60));
        student.add(new Student(21,"王五",004,70));
        student.add(new Student(24,"赵六",007,65));
        Collections.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore()-o2.getScore();
            }
        });

    }
}
