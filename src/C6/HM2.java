package C6;

import java.util.*;

public class HM2 {

	/**
	 * ����һ��5��Ԫ�ص�һά����(arr)���Ӽ�������5��Ԫ�ص�ֵ���г�ʼ����ʵ��ð�����������
	 * ����Ĵ�������ʼ�������������Ҫ��ֺ���д.(3��)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int []arr=new int[5];
		int[] arr = init();
		sort(arr);
		print(arr);
	}

	public static int[] init() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������" + (i + 1) + "��Ԫ��");
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
