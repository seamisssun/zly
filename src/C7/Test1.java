package C7;

import java.util.Scanner;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要判断的数");
		int a=sc.nextInt();
		if(prime(a)){
			System.out.println(a+"是素数");
			}
		else{
			System.out.println(a+"不是素数");
			}
		for(int i=2;i<101;i++){
			if(prime(i)){System.out.println(i);}
		}
	}
	public static boolean prime(int a){
		for(int i=2;i<a;i++){
			if(a%i==0){return false;
				}
			
		}
		return true;
	}

}
