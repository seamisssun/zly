package C6;
import java.util.*;
public class HM1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÊı×Ö");
		double a=sc.nextDouble();
		System.out.println("ÇëÊäÈëÔËËã·û");
		char c=sc.next().charAt(0);
		System.out.println("ÇëÊäÈëÊı×Ö");
		double b=sc.nextDouble();
		if(c=='+'||c=='-'||c=='*'||c=='/'){
		System.out.println(cal(a,b,c));}
		else{System.out.println("·ûºÅÊäÈë´íÎó");}
	}
		public static double cal(double a,double b,char c){  
		double d=0;
		if(c=='+'){d=a+b;} 
		else if(c=='-'){d=a-b;}
		else if(c=='*'){d=a*b;}
		else if(c=='/'){d=a/b;}
		
		return d;
		
		
	}
	

}
