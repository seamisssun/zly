package y2;

import java.util.Scanner;


public class Test {
	 static Scanner sc=new Scanner(System.in);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
	    System.out.println("����������a");
		double a=sc.nextDouble();
		System.out.println("����������b");
		double b=sc.nextDouble();
		System.out.println("�����������");
		char ch=sc.next().charAt(0);
		if(ch=='+'){System.out.println(a+b);}
		else if(ch=='-'){System.out.println(a-b);}
		else if(ch=='*'){System.out.println(a*b);}
		else if(ch=='/'){System.out.println(a/b);}
		else{System.out.println("�Ҳ����������");

		}
	}

}
