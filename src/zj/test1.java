package zj;
import java.util.*;
public class test1 {

	/**
	 * 1.���������ж��˵������ڣ�60������---�����ˣ�40~60��---�����ˣ�20~40��---�����ˣ�
	 * 10~20��---�����ꣻ10������--- ��ͯ�����ʵ��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("����������");
		int age=sc.nextInt();
		int a=age/10;
			switch(a){
			case 10:
			case 9:
			case 8:
			case 7:	
			case 6: System.out.println(age+"��������");
				break;
			case 5:
			case 4:System.out.println(age+"��������");
			break;
			case 3:
			case 2:System.out.println(age+"��������");
			break;
			case 1:System.out.println(age+"��������");
			break;
			case 0:System.out.println(age+"�Ƕ�ͯ");
			break;
			default:System.out.println("�������");
			break;
			}
		}
	}


