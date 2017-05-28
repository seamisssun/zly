package C4;
import java.util.*;
public class Test4 {

	/**二分查找
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,33,55,88};
		System.out.println("请输入要查找的数");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int start=0;
		int index=-1;
		int end=arr.length-1;
		int mid=0;
		while(start<=end){mid=(start+end)/2;
			if(a==arr[mid]){index=mid;
			break;}
			if(a<arr[mid]){end=mid-1;}
			if(a>arr[mid]){start=mid+1;}
			
		}
		if(mid==-1){System.out.println(index);}
		else{System.out.println("未找到");}	
}
}