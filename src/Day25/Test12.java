package Day25;


import java.util.Scanner;

/**
 * Created by Administrator on 2017/6/26.
 */
public class Test12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a=sc.nextInt();
        reversed1(a);
        reversed2(a);
        System.out.println(reversed1(a));
        System.out.println(reversed2(a));


    }
    public static int reversed1(int a){

        int []arr = new int[100];
        int i = 0;
        while (a >= 1) {
            arr[i] = a % 10;
            i++;
            a = a / 10;
        }
        int c = 0;
        for (int b = 0; b < i; b++) {
            int index = i - b - 1;
            //  System.out.println(index);
            //     System.out.println(a[b]);

            c += arr[b] * (Math.pow(10, index));

        }
        return c;

    }
    private static int reversed2(int a) {
        String b=String.valueOf(a);
        StringBuilder sb=new StringBuilder(b);
        sb.reverse();
        String c=sb.toString();
        int d=Integer.valueOf(c);
        return  d;

    }

    }

