package com.zly.yu1;

import java.util.Scanner;

public class qiu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������뾶");
		double R =sc.nextDouble();
		double pi=3.14;
		double v=4/3*pi*R*R*R;
		double s=4*pi*R*R;
		System.out.println("�������"+s+"\t\t�����"+v);
	}

}
