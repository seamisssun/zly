package C5;

import java.util.*;

public class Testt2 {

	/**从键盘获得输入初始化二维数组   并遍历输出
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("请输入第"+(i+1)+"个一维数组的第" + j + "元素");
				arr[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
