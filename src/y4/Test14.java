package y4;
import java.util.*;
public class Test14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("����������a");
		int a=sc.nextInt();
		System.out.println("����������b");
		int b=sc.nextInt();
		int c;
		int d;
		int e=a*b;
		int f;
		while((c=a%b)!=0){b=a;c=b;}
		d=b;
		f=e/d;
		System.out.println("���Լ����"+d);
		System.out.println("��С��������"+f);
		
	}

}
