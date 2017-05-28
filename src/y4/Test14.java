package y4;
import java.util.*;
public class Test14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入整数a");
		int a=sc.nextInt();
		System.out.println("请输入整数b");
		int b=sc.nextInt();
		int c;
		int d;
		int e=a*b;
		int f;
		while((c=a%b)!=0){b=a;c=b;}
		d=b;
		f=e/d;
		System.out.println("最大公约数："+d);
		System.out.println("最小公倍数："+f);
		
	}

}
