package Y5;
import java.util.Scanner;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int a=sc.nextInt();
		int c=1;
		int b=1;
		while(a>0){c=a%10;b=a/10;}
		System.out.println(c+""+b);
	}
}
