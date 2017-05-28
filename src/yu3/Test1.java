package yu3;

import java.util.Scanner;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个两位数");
		int a = sc.nextInt();
		// System.out.println(String.valueOf(a).charAt(1).);
		// System.out.println(String.valueOf(a).charAt(0));

		if (a % 3 == 0 || String.valueOf(a).charAt(0) == '3'
				|| String.valueOf(a).charAt(1) == '3') {
			System.out.println("满足条件");
		} else {
			System.out.println("不满足条件");
		}

	}

}
