package C1;

import java.util.*;

public class year {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����");
		int a = sc.nextInt();
		System.out.println("������һ���·�");
		int b = sc.nextInt();
		if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0)) {
			System.out.println(a + "������");
			if (b == 2) {
				System.out.println("2����29��");
			} else if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8
					|| b == 10 || b == 12) {
				System.out.println(b + "��31��");
			} else {
				System.out.println(b + "��30��");
			}
		} else {
			System.out.println(a + "��ƽ��");
			if (b == 2) {
				System.out.println("2����28��");
			} else if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8
					|| b == 10 || b == 12) {
				System.out.println(b + "��31��");
			} else {
				System.out.println(b + "��30��");
			}
		}
	}

}
