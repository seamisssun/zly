package lianxi;

import java.util.Scanner;

public class Test4 {

	/**
	 * ��д�ж������ĺ������ٵ��øú������1000���ڵ�����������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ�жϵ���");
		int a = sc.nextInt();

		if (prime(a)) {
			System.out.println(a + "������");
		} else {
			System.out.println(a + "��������");
		}
		System.out.println("������������");
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
		for (int i = 2; i < n; i++) {
			if (prime(i)) {
				System.out.println(i);
			}
		}
	}
}
