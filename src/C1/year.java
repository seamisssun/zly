package C1;

import java.util.*;

public class year {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个年份");
		int a = sc.nextInt();
		System.out.println("请输入一个月份");
		int b = sc.nextInt();
		if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {
			System.out.println(a + "是闰年");
			if (b == 2) {
				System.out.println("2月有29天");
			} else if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8
					|| b == 10 || b == 12) {
				System.out.println(b + "有31天");
			} else {
				System.out.println(b + "有30天");
			}
		} else {
			System.out.println(a + "是平年");
			if (b == 2) {
				System.out.println("2月有28天");
			} else if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8
					|| b == 10 || b == 12) {
				System.out.println(b + "有31天");
			} else {
				System.out.println(b + "有30天");
			}
		}
	}

}
