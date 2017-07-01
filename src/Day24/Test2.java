package Day24;


import Day23.Cat;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/23.
 */
public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Cat>cat=new ArrayList<>();
        cat.add(new Cat("叮当","女",3));
        cat.add(new Cat("妮妮","女",5));
        cat.add(new Cat("摩尼","男",6));
        FileOutputStream fos=new FileOutputStream("G:\\123.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(cat);
        oos.close();
        FileInputStream fis=new FileInputStream("G:\\123.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Cat>cats=(ArrayList<Cat>) ois.readObject();
        System.out.println(cats);
        ois.close();



    }
}
