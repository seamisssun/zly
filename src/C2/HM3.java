package C2;

import java.util.*;

public class HM3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int price = random.nextInt(8000) + 2000;
		//System.out.println(price);
		Scanner sc = new Scanner(System.in);
		System.out.println("��²⹫���綯���ļ۸�2000-10000֮�䣩��");
		int b;
		int i = 1;
		while (i <= 5) {
			b = sc.nextInt();
			if (b == price) {
				System.out.println("��ϲ�㣬����˴˽�Ʒ!");
				return;

			} else if (i == 5) {
				System.out.println("��û�л�ý�Ʒ!");

			} else if (b < price) {
				System.out.println("�ٴ��!");
			} else if (b > price) {
				System.out.println("��С��!");
			}

			i++;

		}

	}
}
