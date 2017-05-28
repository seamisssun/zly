package C4;

import java.util.*;

public class Test5 {

	/**输入一个数，查找是不是在数组中，不在插入到数组最后
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 2, 5, 9, 10, 15 };
		int[] arr2 = new int[arr.length + 1];
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查找的数");
		int a = sc.nextInt();
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (a == arr[i]) {
				index = i;
				break;
			}

		}
		if (index != -1) {
			System.out.println(index);
		} else {
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			arr2[arr.length] = a;
			for (int i = 0; i < arr2.length; i++) {
				System.out.print(arr2[i] + " ");
			}
		}

	}

}
