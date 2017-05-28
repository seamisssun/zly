package C7;

import java.util.*;

public class Test2 {

	/**
	 * 数组管理系统 1.初始化数组 2.遍历数组 3.排序 4.查找(如果不存在，将这个数 插入数组) 5.删除
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数组长度");
		int n = sc.nextInt();
		int[] arr = new int[n];

		while (true) {
			System.out.println("1 初始化数组");
			System.out.println("2 遍历数组");
			System.out.println("3 排序");
			System.out.println("4 查找");
			System.out.println("5 删除");
			System.out.println("6 退出");
			int key = sc.nextInt();
			switch (key) {
			case 1:
				init(arr);
				break;
			case 2:
				print(arr);
				break;
			case 3:
				sort(arr);
				break;
			case 4:
				arr = search(arr);
				break;
			case 5:
				arr = del(arr);
				break;
			case 6:
				return;
			default:
				System.out.println("输入错误");
				break;
			}
		}
	}

	public static void init(int[] arr) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入 数组的第" + (i + 1) + "个元素");
			arr[i] = sc.nextInt();
		}

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		print(arr);
	}

	public static int find(int[] arr, int a) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (a == arr[i]) {
				index = i;
			}
				}
		return index;
	}

	public static int[] search(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查找的数");
		int a = sc.nextInt();
		int[] arr1 = new int[arr.length + 1];
		if (find(arr, a) == -1) {
			System.out.println("要查找的数不在");

			for (int i = 0; i < arr.length; i++) {
				arr1[i] = arr[i];

			}
			arr1[arr.length] = a;

			arr = arr1;
		} else {
			int index = find(arr, a);
			System.out.println("要查找的数的下标" + index);
		}
		return arr;
	}

	public static int[] del(int[] arr) {
		int[] arr2 = new int[arr.length - 1];
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要删除的数");
		int b = sc.nextInt();
		int index = find(arr, b);
		if (index == -1) {
			System.out.println("要删除的数不存在");
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (i < index) {
					arr2[i] = arr[i];

				}
				if (i > index) {
					arr2[i - 1] = arr[i];
				}
			}
			arr = arr2;

		}
		return arr;
	}
}
