package C2;
import java.util.*;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int svn=1;
		for(int i=1;i<20;i+=2){svn*=i;}
		System.out.println(svn);*/
		Scanner sc=new Scanner(System.in);
		System.out.println(" 请输入一个正整数");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){sum+=i;}
		System.out.println(sum);
	}

}
