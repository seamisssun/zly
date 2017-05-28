package C5;
import java.util.*;
public class Test4 {

	/**有一个数列：8，4，2，1，23，344，12循环输出数列的值求数列中所有数值的和
		    猜数游戏：从键盘中任意输入一个数据，判断数列中是否包含此数。

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[]{8,4,2,1,23,344,12};
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要查找的数");
		int a=sc.nextInt();
		int sum=0;
		int index=-1;
		for(int i=0;i<arr.length;i++){sum+=arr[i];
			System.out.print(arr[i]+" ");
			
		}System.out.println("所有数值的和："+sum);
		for(int i=0;i<arr.length-1;i++){
			if(a==arr[i]){index=i;break;}
		}
		if(index!=-1){
			System.out.println(index);}
			else{
				System.out.println("无此数");}
		}
	}


