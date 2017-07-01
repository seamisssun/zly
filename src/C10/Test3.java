package C10;
import java.util.*;
public class Test3 {

	/**题四：	定义一个整型数组a[10]，并从键盘输入一个正整数n（n<=10），
  		再连续从键盘输入n个整数存入a[10](如n是5，就连续从键盘取5个整数存入数组)，再求你录入的n个数中的最大值和最小值，并输出。
  		(要求静态方法实现findMax() findMin())
 		考察知识点：数组的定义和初始化，数组的应用，方法的调
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[10]; 
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个不大于10的值");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("请输入第"+(i+1)+"个元素");
			arr[i]=sc.nextInt();
		}
		System.out.println("最大值"+findMax(arr));
		System.out.println("最小值"+findMin(arr));
	}
	public static int findMax(int []arr){
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
		if(arr[i]>max){
			max=arr[i];
		}
		}return max;
	}
	public static int findMin(int []arr){
		int min=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				arr[i]=min;
			}
			
		}return min;
	}

}
