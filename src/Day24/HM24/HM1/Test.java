package Day24.HM24.HM1;


import java.io.*;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/23.
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Employee> em = new ArrayList<>();
        em.add(new Employee(001, "张三", 5000));
        em.add(new Employee(002, "李四", 5600));
        em.add(new Employee(003, "王五", 6800));

        FileOutputStream fos = new FileOutputStream("G:\\Employee.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(em);
        oos.close();
        FileInputStream fis = new FileInputStream("G:\\Employee.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Employee> ems = (ArrayList<Employee>) ois.readObject();
        System.out.println(ems);
        ois.close();

    }
}
