package lianxi;

import java.util.Scanner;

public class Test5 {

	/**编写判断素数的函数，调用该函数求出1000以内的所有素数，存入数组中并输出。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要判断的数");
		int a=sc.nextInt();
		if(prime(a)){
			System.out.println(a+"是素数");
			}else{
				System.out.println(a+"不是素数");
			}
		
	}
	public static boolean prime(int a){
		for(int i=2;i<a;i++){
			if(a%i==0){
				return false;
			}
		}return true;
	}
	public static void prime1(int n) {
		int count=0;
		for (int i = 2; i < n; i++) {
			if (prime(i)) {count++;
				System.out.println(i);
			}
			int []arr=new int[count];
		}
	}

}
