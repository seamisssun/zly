package y4;
import java.util.Scanner;
public class Test9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int n=sc.nextInt();
		int a=1;
		for(int i=1;i<=n;i++){a=a*i;}
		System.out.println(a);
	}

}
