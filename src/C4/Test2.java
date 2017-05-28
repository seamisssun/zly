package C4;

import java.util.*;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 5, 4, 9, 6, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查找的数字");
		int a = sc.nextInt();
		int b = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				b = i;
				break;
			}
		}
		if (b != -1) {
			System.out.println(b);
		} else {
			System.out.println("未找到");
		}

	}

}
