package lianxi;
import java.util.*;
public class Test3 {

	/**��д�ж������ĺ������ٵ��øú����ж�1937�Ƿ���������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ�жϵ���");
		int a=sc.nextInt();
		if(prime(a)){
			System.out.println(a+"������");
		}else{System.out.println(a+"��������");}
	}
	public static boolean prime(int a){
		for(int i=2;i<a;i++){
			if(a%i==0){
				return false;
			}
		}return true;
	}

}
