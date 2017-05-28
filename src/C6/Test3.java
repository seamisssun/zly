package C6;
import java.util.*;
public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入年");
		int y=sc.nextInt();
		System.out.println("请输入月");
		int m=sc.nextInt();
		System.out.println("请输入日");
		int d=sc.nextInt();
		if(y>=1&&y<9999){
		if(y%400==0||(y%4==0&&y%100!=0)){
		if(m==4||m==6||m==9||m==11){
				if(d<31){System.out.println(y+"年"+m+"月"+d+"日验证通过");}
				else{System.out.println(y+"年"+m+"月"+d+"日验证不通过");}	
			}
		if(m==2){
			if(d<30&&d>28){System.out.println(y+"年"+m+"月"+d+"日验证通过");}
			else{System.out.println(y+"年"+m+"月"+d+"日验证不通过");}
		}
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
			if(d<32){System.out.println(y+"年"+m+"月"+d+"日验证通过");}
			else{System.out.println(y+"年"+m+"月"+d+"日验证不通过");}
		}
		}
		else{
			if(m==4||m==6||m==9||m==11){
				if(d<31){System.out.println(y+"年"+m+"月"+d+"日验证通过");}
				else{System.out.println(y+"年"+m+"月"+d+"日验证不通过");}	
			}
		if(m==2){
			if(d<28){System.out.println(y+"年"+m+"月"+d+"日验证通过");}
			else{System.out.println(y+"年"+m+"月"+d+"日验证不通过");}
		}
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
			if(d<32){System.out.println(y+"年"+m+"月"+d+"日验证通过");}
			else{System.out.println(y+"年"+m+"月"+d+"日验证不通过");}
		}
		}
		
			
		}
		else{System.out.println(y+"年"+m+"月"+d+"日验证不通过");}
	}

}
