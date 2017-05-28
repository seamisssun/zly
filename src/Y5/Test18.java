package Y5;
import java.util.*;
public class Test18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<=a/2;i++){if(a%i==0){sum+=i;}}
		if(sum==a){System.out.println(a+"是完数");}
		else{System.out.println(a+"不是完数");}
	}

}
