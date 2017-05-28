package C6;

import java.util.*;

public class HM2 {

	/**
	 * 定义一个5个元素的一维数组(arr)，从键盘输入5个元素的值进行初始化，实现冒泡排序并输出，
	 * 数组的创建、初始化、排序、输出都要求分函数写.(3’)
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
			System.out.println("请输入的" + (i + 1) + "个元素");
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
