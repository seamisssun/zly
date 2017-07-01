package lianxi;
import java.util.*;
public class Test3 {

	/**编写判断素数的函数，再调用该函数判断1937是否是素数。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要判断的数");
		int a=sc.nextInt();
		if(prime(a)){
			System.out.println(a+"是素数");
		}else{System.out.println(a+"不是素数");}
	}
	public static boolean prime(int a){
		for(int i=2;i<a;i++){
			if(a%i==0){
				return false;
			}
		}return true;
	}

}
