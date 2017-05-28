package C1;
import java.util.*;
public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个整数");
		int mun1=sc.nextInt();
		System.out.println("请输入第二个整数");
		int mun2=sc.nextInt();
		System.out.println("请输入第三个整数");
		int mun3=sc.nextInt();
		if(mun1>mun2&&mun2>mun3){System.out.print("mun1:"+mun1+" "+"mun2:"+mun2+" "+"mun3:"+mun3);}
		else if(mun2>mun1&&mun1>mun3){System.out.print("mun2:"+mun2+" "+"mun1:"+mun1+" "+"mun3:"+mun3);}
		else if(mun3>mun1&&mun1>mun2){System.out.print("mun3:"+mun3+" "+"mun1:"+mun1+" "+"mun2:"+mun2);}
		else if(mun1>mun3&&mun3>mun2){System.out.print("mun1:"+mun1+" "+"mun3:"+mun3+" "+"mun2:"+mun2);}
		else if(mun3>mun2&&mun2>mun1){System.out.print("mun3:"+mun3+" "+"mun2:"+mun2+" "+"mun1:"+mun1);}
		else{System.out.print("mun2:"+mun2+" "+"mun3:"+mun3+" "+"mun1:"+mun1);}
	}

}
