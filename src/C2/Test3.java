package C2;

import java.util.Scanner;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i=1;i<4;i++) {
			System.out.println("��ӭ����˵�ע��");
			System.out.println("��ѡ������Ҫ�Ĺ���");
			System.out.println("1 ע��" + " " + "2.��¼" + " " + "3.�˳�");
			int a = sc.nextInt();
			switch (a) {
			case 1:
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


