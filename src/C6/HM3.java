package C6;
import java.util.*;
public class HM3 {

	/**用户键盘输入正整数n,创建n个整数的数组，输入n个整数，用降序排序并输出。(输入n个整数初始化、
	 * 降序、打印功能要求写成静态方法并调用，否则-1分)
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
		System.out.println("请输入数组长度");
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入第"+(i+1)+"个元素");
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