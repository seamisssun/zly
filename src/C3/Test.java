package C3;
import java.util.*;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ����");
		int a=sc.nextInt();
		/*arr[0]=5;
		arr[1]=6;
		arr[2]=9;
		for(int i=0;i<arr.length;i++){System.out.println(arr[i]);}*/
		System.out.println("��������һ����");
		int b=sc.nextInt();
		System.out.println("��������һ����");
		int c=sc.nextInt();
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;		
		for(int i=0;i<arr.length;i++){System.out.println(arr[i]);}
	}
}
