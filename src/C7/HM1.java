package C7;

import java.util.*;

public class HM1 {

	/**
	 * ��д��̬����ʵ�֣�����ĳ��ĳ��ĳ�����ڼ����㷨��ʾ��1900��1��1������һ��
	 * ����ĳ��ĳ��ĳ�վ���1900��1��1�չ����죬������%7=������(0
	 * -6��ʾ������~������)���꣬�£����ɼ������룬����ֱ��д��main����Ҫ������д����Ҫ���������Լ�����
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("��������");
		int year = sc.nextInt();
		System.out.println("��������");
		int month = sc.nextInt();
		System.out.println("��������");
		int day = sc.nextInt();

		int daydiff = yeardiff(year) + day + monthdiff(month, runyear(year));
		System.out.println(daydiff);
		int dw = daydiff % 7;
		switch (dw) {
		case 0:
			System.out.println(year + "��" + month + "��" + day + "��������");
			break;
		case 1:
			System.out.println(year + "��" + month + "��" + day + "������һ");
			break;
		case 2:
			System.out.println(year + "��" + month + "��" + day + "�����ڶ�");
			break;
		case 3:
			System.out.println(year + "��" + month + "��" + day + "��������");
			break;
		case 4:
			System.out.println(year + "��" + month + "��" + day + "��������");
			break;
		case 5:
			System.out.println(year + "��" + month + "��" + day + "��������");
			break;
		case 6:
			System.out.println(year + "��" + month + "��" + day + "��������");
			break;

		}
	}
//�Ƿ�������
	public static boolean runyear(int year) {
		if (year % 400 == 0 || (year % 4 == 0 & year % 100 != 0)) {
			return true;
		} else {
			return false;
		}

	}
//ÿ������
	public static int daycount(int month, boolean runyn) {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			if (runyn) {
				return 29;
			} else {
				return 28;
			}
		}
		return month;
	}
//һ�������
	public static int yeardiff(int year) {
		int yeardiff = 0;
		for (int ys = 1900; ys <=year; ys++) {
			if (runyear(year)) {
				yeardiff += 366;
			} else {
				yeardiff += 365;
			}
		}
		return yeardiff;

	}
//�·ݼ�����
	public static int monthdiff(int month, boolean runyn) {
		int monthdiff = 0;
		for (int mths = 1; mths < month; mths++) {
			monthdiff += daycount(mths, runyn);

		}

		return monthdiff;

	}
	
	

}
