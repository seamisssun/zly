package Day19;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/14.
 */
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入两个数字");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        try{  c=a/b;

        }catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println(c);
    }
}
