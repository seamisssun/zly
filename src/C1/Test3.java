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
		System.out.println("请输入一个数字");
		double a = sc.nextDouble();
		System.out.println("请输入符号");
		char ch = sc.next().charAt(0);
		System.out.println("请再输入一个数字");
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
				System.out.println("输入错误");
				break;
		
			}
			System.out.println("是否继续 y/n");
			String answer = sc.next();
			if (answer.equals("n")) {
				break;
			}

		}
	}
}
