package y4;

import java.util.Scanner;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���������");
		int a = sc.nextInt();
		/*
		 * if (a>100||a<0){System.out.println("�Ƿ�");} else if
		 * (a>=90){System.out.println("�ȼ�ΪA");} else
		 * if(a<90&&a>=80){System.out.println("�ȼ�ΪB");} else
		 * if(a<80&&a>=70){System.out.println("�ȼ�ΪC");} else
		 * if(a>70&&a<=60){System.out.println("�ȼ�ΪD");}
		 * else{System.out.println("�ȼ�ΪE");}
		 */
		int key = a / 10;
		switch (key) {
		case 10:
		case 9:
			System.out.println("�ȼ�ΪA");
			break;
		case 8:
			System.out.println("�ȼ�ΪB");
			break;
		case 7:
			System.out.println("�ȼ�ΪC");
			break;
		case 6:
			System.out.println("�ȼ�ΪD");
			break;
		default:
			System.out.println("�ȼ�ΪE");
		}

	}

}
