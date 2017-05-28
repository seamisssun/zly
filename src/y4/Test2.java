package y4;

import java.util.Scanner;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入分数");
		int a = sc.nextInt();
		/*
		 * if (a>100||a<0){System.out.println("非法");} else if
		 * (a>=90){System.out.println("等级为A");} else
		 * if(a<90&&a>=80){System.out.println("等级为B");} else
		 * if(a<80&&a>=70){System.out.println("等级为C");} else
		 * if(a>70&&a<=60){System.out.println("等级为D");}
		 * else{System.out.println("等级为E");}
		 */
		int key = a / 10;
		switch (key) {
		case 10:
		case 9:
			System.out.println("等级为A");
			break;
		case 8:
			System.out.println("等级为B");
			break;
		case 7:
			System.out.println("等级为C");
			break;
		case 6:
			System.out.println("等级为D");
			break;
		default:
			System.out.println("等级为E");
		}

	}

}
