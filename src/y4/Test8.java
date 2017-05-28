package y4;
import java.util.*;
public class Test8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){sum+=i;}
		System.out.println(sum);
	}

}
