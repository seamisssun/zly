package C5;

import java.util.*;

public class Testt2 {

	/**�Ӽ��̻�������ʼ����ά����   ���������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("�������"+(i+1)+"��һά����ĵ�" + j + "Ԫ��");
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
