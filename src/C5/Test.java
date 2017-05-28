package C5;

import java.util.*;

public class Test {

	/**
	 * 输入一个数，查找是否在数组中，如果在返回下标，如果不在插入到数组末尾，排序后遍历数组
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 5, 8, 9, 6, 3 };

		int index = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查找的数");
		int a = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (a == arr[i]) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			System.out.println(index);
		} else {
			int[] arr1 = new int[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {

				arr1[i] = arr[i];

			}
			arr1[arr.length] = a;

			for (int i = 0; i < arr1.length - 1; i++) {
				for (int j = i + 1; j < arr1.length; j++) {
					if (arr1[i] > arr1[j]) {
						int temp = arr1[i];
						arr1[i] = arr1[j];
						arr1[j] = temp;
					}

				}

			}
			for (int i = 0; i < arr1.length; i++) {
				System.out.print(arr1[i] + " ");
			}
		}

	}

}
