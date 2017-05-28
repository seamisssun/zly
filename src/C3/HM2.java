package C3;

import java.util.Scanner;

public class HM2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generaed method stub
		int arr[] = new int[] { 1, 2, 3, 4, 5, 7,8 };
		int arr2[] = new int[8];
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数");
		int a = sc.nextInt();
		int b = 0;
		// int c=0;
		for (int i = 0; i < arr2.length; i++) {
			if (i > arr.length-1) {
				arr2[i] = a;

			} else {
				if (a > arr[i]) {
					arr2[i] = arr[i];

				} else {
					arr2[i] = a;

					a = arr[i];
				}
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		

	}

}
