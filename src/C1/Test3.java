package C1;

import java.util.*;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
		System.out.println("������һ������");
		double a = sc.nextDouble();
		System.out.println("���������");
		char ch = sc.next().charAt(0);
		System.out.println("��������һ������");
		double b = sc.nextDouble();
		
			switch (ch) {
			case '+':
				System.out.println(a + b);
				break;
			case '-':
				System.out.println(a - b);
				break;
			case '*':
				System.out.println(a * b);
				break;
			case '/':
				System.out.println(a / b);
				break;
			default:
				System.out.println("�������");
				break;
		
			}
			System.out.println("�Ƿ���� y/n");
			String answer = sc.next();
			if (answer.equals("n")) {
				break;
			}

		}
	}
}
