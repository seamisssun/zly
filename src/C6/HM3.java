package C6;
import java.util.*;
public class HM3 {

	/**�û���������������n,����n�����������飬����n���������ý������������(����n��������ʼ����
	 * ���򡢴�ӡ����Ҫ��д�ɾ�̬���������ã�����-1��)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=init();
		sort(arr);
		print(arr);
	}
	public static int [] init(){
		Scanner sc=new Scanner(System.in);
		System.out.println("���������鳤��");
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++){
			System.out.println("�������"+(i+1)+"��Ԫ��");
			arr[i]=sc.nextInt();}
					return arr;
		
	}
	
public static void sort(int[] arr) {
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length-i-1; j++) {
			if (arr[j] < arr[j + 1]) {
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
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