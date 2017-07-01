package C7;

import java.util.*;

public class HM1 {

	/**
	 * 编写静态方法实现：计算某年某月某日星期几，算法提示：1900年1月1日星期一，
	 * 计算某年某月某日距离1900年1月1日共几天，总天数%7=星期数(0
	 * -6表示星期日~星期六)。年，月，日由键盘输入，不可直接写在main，需要按方法写（需要几个方法自己定）
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年");
		int year = sc.nextInt();
		System.out.println("请输入月");
		int month = sc.nextInt();
		System.out.println("请输入日");
		int day = sc.nextInt();

		int daydiff = yeardiff(year) + day + monthdiff(month, runyear(year));
		System.out.println(daydiff);
		int dw = daydiff % 7;
		switch (dw) {
		case 0:
			System.out.println(year + "年" + month + "月" + day + "日星期日");
			break;
		case 1:
			System.out.println(year + "年" + month + "月" + day + "日星期一");
			break;
		case 2:
			System.out.println(year + "年" + month + "月" + day + "日星期二");
			break;
		case 3:
			System.out.println(year + "年" + month + "月" + day + "日星期三");
			break;
		case 4:
			System.out.println(year + "年" + month + "月" + day + "日星期四");
			break;
		case 5:
			System.out.println(year + "年" + month + "月" + day + "日星期五");
			break;
		case 6:
			System.out.println(year + "年" + month + "月" + day + "日星期六");
			break;

		}
	}
//是否是闰年
	public static boolean runyear(int year) {
		if (year % 400 == 0 || (year % 4 == 0 & year % 100 != 0)) {
			return true;
		} else {
			return false;
		}

	}
//每月天数
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
//一年的天数
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
//月份计数器
	public static int monthdiff(int month, boolean runyn) {
		int monthdiff = 0;
		for (int mths = 1; mths < month; mths++) {
			monthdiff += daycount(mths, runyn);

		}

		return monthdiff;

	}
	
	

}
