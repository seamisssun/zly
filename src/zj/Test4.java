package zj;
import java.util.*;
public class Test4 {

	/**
	 * ��д����ʵ���ж�ĳ��ĳ�¹����졣�㷨��ʾ��
	 *  d)�·ݿ����ó���12�������¼��Ҳ������switch-case 
	 *  e)2�·���Ҫ�ж��Ƿ�����
	 * f)��Ҫ�þ�̬����ʵ��
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("��������");
		int year=sc.nextInt();
		System.out.println("��������");
		int month=sc.nextInt();
		if(year%400==0||(year%4==0&&year%100!=0)){
			if(month==2){System.out.println(year+"��"+month+"����29��");}
		}else{System.out.println(year+"��"+month+"����28��");}
		switch(month){
		case 4:
		case 6:
		case 9:
		case 11:System.out.println(year+"��"+month+"����30��");
		break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:System.out.println(year+"��"+month+"����31��");
		break;
		
		}
	}

}
