package y2;

import java.util.Scanner;

public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入三个整数");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b&&a>c){System.out.println(a);}
		else if(b>c&&b>a){System.out.println(b);}
		else{System.out.println(c);}
		
		
	}

}
