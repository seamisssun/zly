package C3;
import java.util.*;
public class Test2 {

	/**求得斐波那契数列前20项的值并输出
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[20];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<arr.length;i++){arr[i]=arr[i-1]+arr[i-2];}
		System.out.print("[");
		for(int i=0;i<arr.length;i++){System.out.print(arr[i]+" ");}
		System.out.println("]");
	
	}

}
