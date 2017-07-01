package zj;

import java.util.*;

public class Test2 {

	/**
	 * 编写代码实现判断某个数是否素数（只能被1和自身整除的数），并测试： a)2013是否素数
	 * b)键盘输入某个正整数，从0-这个数中间，有多少个素数（如键盘输入100，输出0-100之间有多少个素数，不含0，含100）
	 * c)需要用静态方法实现
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubi
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入要判断的数");
		int a = sc.nextInt();
		if (prime(a)) {
			System.out.println(a + "是素数");
		} else {
			System.out.println(a + "不是素数");
		}
		;

		System.out.println("请输入整正数");
		int n = sc.nextInt();
		prime1(n);

	}

	public static boolean prime(int a) {

		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
				}
		
		}
		return true;
	}

	public static void prime1(int n) {
		int count=0;
		for (int i = 2; i < n; i++) {
			if (prime(i)) {count++;
				System.out.println(i);
			}
		}
		System.out.println("一共"+count+"个素数");
	}

}
