package C5;

import java.util.*;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][2];
		
		double c=0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("�������" + (i + 1) + "��ѧԱ�ĵ�" + j + "���ɼ�:");
				arr[i][j] = sc.nextInt();
			}

		}System.out.println("���"+"    �γ�1"+"    �γ�2"+"    ƽ����");
		for (int i = 0; i < arr.length; i++) {
			double b = 0;
			System.out.print(i+1+" ");
			
			for (int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j]+"\t");
				b += arr[i][j];
				c=b/arr[j].length;
			}System.out.println(c);
		}
		System.out.println("----------------------");
		System.out.print("ƽ��          ");
		for(int i=0;i<arr[0].length;i++){
			double sum=0;
			for(int j=0;j<arr.length;j++){
				sum+=arr[j][i];}
			System.out.print(sum/arr.length+"\t");

		}
	}

}
