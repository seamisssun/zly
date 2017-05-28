package C6;

import java.util.*;

public class Test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (year(a)) {
			System.out.println(a + "是闰年");
		} else {
			System.out.println(a + "不是闰年");
		}
	}

	public static boolean year(int a) {
		if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {
			return true;
		} else {
			return false;
		}
	}
}
