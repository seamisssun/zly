package C1;
import java.util.*;
public class job1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("����������");
		int age=sc.nextInt();
		/*if(age>60){System.out.println("������");}
		else if(age<=60&&age>40){System.out.println("������");}
		else if(age<=40&&age>20){System.out.println("������");}
		else if(age<=20&&age>10){System.out.println("������");}
		else{System.out.println("��ͯ");}*/
		int b=age/10;
		switch(b){
		case 10:
		case 9:
		case 8:
		case 7:
		case 6:
			System.out.println("������");
			break;
		case 5:	
		case 4:
			System.out.println("������");
			break;
		case 3:
		case 2:
			System.out.println("������");
			break;
		case 1:
			System.out.println("������");
			break;
		default:
			System.out.println("��ͯ");
			break;
		}
	}

}
