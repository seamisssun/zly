package C4;

import java.util.*;

public class HM1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("ÇëÊäÈëµÚ" + (i + 1) + "ÔªËØ");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp=arr[i];
				    arr[i]=arr[j];
				    arr[j]=temp;
				}

			}
		}for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");

		
		}
	}

}
