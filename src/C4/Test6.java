package C4;

import java.util.Scanner;

public class Test6 {

	/**
	 * ɾ�������е�ָ��Ԫ��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 2, 5, 9, 10, 15 };
		int[] arr2 = new int[arr.length - 1];
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ���ҵ���");
		int a = sc.nextInt();
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (index == -1) {
				System.out.println("�޴���");
			} else {
				if (i < index) {
					arr2[i] = arr[i];

				}
				if (i > index) {
					arr2[i - 1] = arr[i];
				}
			}

		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
