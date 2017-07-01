package Day16.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/9.
 */
public class Test {


    public static void main(String []args){

        Student []arr=new Student[3];
        arr[0]=new Student(1,"lili",90);
        arr[1]=new Student(5,"lilu",80);
        arr[2]=new Student(3,"lilv",60);
        for(Student student:arr) {
            System.out.println(student.toString());
        }

        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId()-o2.getId();


            }
        });
        for(Student student:arr) {
            System.out.println(student.toString());
        }
        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore()-o1.getScore();
            }
        });
        for(Student student:arr) {
            System.out.println(student.toString());
        }

        }


   public static void add(Student []arr){
        Scanner sc=new Scanner(System.in);

       System.out.println("学号");
       int id=sc.nextInt();
       System.out.println("名字");
       String name=sc.next();
       System.out.println("成绩");
       int store=sc.nextInt();
       Student []arr1=new Student[arr.length+1];
       for(int i=0;i<arr.length;i++){
        arr1[i]=arr[i];
           arr1[arr1.length]=new Student();
       }
       Arrays.sort(arr, new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               return o1.getId()-o2.getId();


           }
       });
       for(Student student:arr) {
           System.out.println(student.toString());
       }

    }


}
