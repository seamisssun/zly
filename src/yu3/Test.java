package yu3;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("��������ѧ�ɼ�������100��");
    double math=sc.nextDouble();
    System.out.println("���������ĳɼ�������100��");
    double ch=sc.nextDouble();
    System.out.println("������Ӣ��ɼ�������100��");
    double en=sc.nextDouble();
    double sum=math+ch+en;
    double svn=sum/3;
    System.out.println("�ܷ֣�"+sum+"    ƽ����"+svn);
    
    
    
	}

}
