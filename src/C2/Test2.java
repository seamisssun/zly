package C2;

import java.util.*;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean flag=true
		Scanner sc = new Scanner(System.in);
		int count=0;
		while (true) {
			System.out.println("��ӭ����˵�ע��");
			System.out.println("��ѡ������Ҫ�Ĺ���");
			System.out.println("1 ע��" + " " + "2.��¼" + " " + "3.�˳�");
			int a = sc.nextInt();
			switch (a) {
			case 1:if(count==3){return;
			}count++;
				System.out.println("ע��ɹ�");
				break;
			case 2:
				System.out.println("��¼�ɹ�");
				break;
			case 3:
				System.out.println("��ӭʹ��");
				//flag=false ѭ������
				return;
			default:
				System.out.println("�������");
				break;
			}
			System.out.println("�Ƿ����y/n");
			String answer = sc.next();
			if (answer.equals("n")) {
				break;
			}

		}
	}
}
