package Day16.Day16;

import Day16.Day16.Student;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Administrator on 2017/6/9.
 */
public class Test1 {
    public static void main(String []args) {
        Student[] arr = new Student[5];
        arr[0] = new Student(1, "lili", 90);
        arr[1] = new Student(5, "lilu", 80);
        arr[2] = new Student(3, "lilv", 60);
        arr[3] = new Student(2, "lile", 95);
        arr[4] = new Student(4, "lisi", 80);

        Arrays.sort(arr, new Comparator<Student>()

        {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getId() - o2.getId() > 0) {
                    return -1;
                } else if (o1.getId() - o2.getId() < 0) {
                    return 1;
                } else {
                    return 0;
                }
            }

        });


    }
}
