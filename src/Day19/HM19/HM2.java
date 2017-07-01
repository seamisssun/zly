package Day19.HM19;

import java.util.Scanner;

/**
 * 2.写一个方法void judge(int a, int b, int c)，判断三个参数是否能构成一个三角形，如果不能抛出异常
 * IllegalArgumentException，显示异常信息a，b，c+“不能构成三角形”，如果可以构成则显示三角形三个边长，
 * 在主方法中得到命令行输入的三个整数，调用此方法，并捕获异常。
 * Created by Administrator on 2017/6/14.
 */
public class HM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一条边长");
        int a = sc.nextInt();
        System.out.println("请输入第二条边长");
        int b = sc.nextInt();
        System.out.println("请输入第三条边长");
        int c = sc.nextInt();
        try {
            trangle(a, b, c);
        } catch (IllegalArgumentException e
                ) {
            System.out.println("不能构成三角形");
        }
    }

    public static void trangle(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("可以构成三角形");
        } else {
            throw new IllegalArgumentException();
        }


    }
}
