package Day25.Test13;


import java.io.*;
import java.util.*;

/**
 * Created by Administrator on 2017/6/26.
 */
public class test {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        TreeSet<Animal> tm = new TreeSet<Animal>();
        File file = new File("d:\\1.txt");
        FileWriter fw = new FileWriter(file);
        for (int i = 0; i < 5; i++) {
            int d = i + 1;
            System.out.println("第" + d + "个动物的信息");
            System.out.println("请输入名字");
            String name = sc.next();
            System.out.println("请输入年龄");
            int age = sc.nextInt();
            System.out.println("请输入性别");
            String sex = sc.next();
            Animal animal = new Animal(name, age, sex);
            tm.add(animal);
            //   fw.write(animal.toString() + "\n");
        }

        //    fw.write(name+","+age+","+sex);
        Iterator<Animal> it = tm.iterator();
        for (Animal animal : tm) {
            fw.write(animal.toString() + "\n");

        }


        fw.close();
        FileReader fr = new FileReader(file);

        BufferedReader fb = new BufferedReader(fr);
        while (fb.ready()) {
            String a = fb.readLine();
            System.out.println(a);
        }
        fb.close();
        fw.close();

    }
}
