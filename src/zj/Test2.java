package zj;

import java.util.*;

public class Test2 {

	/**
	 * ��д����ʵ���ж�ĳ�����Ƿ�������ֻ�ܱ�1�����������������������ԣ� a)2013�Ƿ�����
	 * b)��������ĳ������������0-������м䣬�ж��ٸ����������������100�����0-100֮���ж��ٸ�����������0����100��
	 * c)��Ҫ�þ�̬����ʵ��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubi
		Scanner sc = new Scanner(System.in);

		System.out.println("������Ҫ�жϵ���");
		int a = sc.nextInt();
		if (prime(a)) {
			System.out.println(a + "������");
		} else {
			System.out.println(a + "��������");
		}
		;

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
		int count=0;
		for (int i = 2; i < n; i++) {
			if (prime(i)) {count++;
				System.out.println(i);
			}
		}
		System.out.println("һ��"+count+"������");
	}

}
