package com.zly.yu1;

import java.util.Scanner;

public class fangchenggen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������a,b,c��ֵ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double delta = b * b - 4 * a * c;

		double x1;
		double x2;
		if (delta > 0) {
			x1 = (0 - b + Math.sqrt(delta)) / 2;
			x2 = (0 - b - Math.sqrt(delta)) / 2;

			System.out.println("x1��ֵΪ:" + x1);
			System.out.println("x2��ֵΪ:" + x2);

		} else if (delta == 0) {

			x1 = (0 - b) / 2;
			x2 = (0 - b) / 2;

			System.out.println("x1��ֵΪ:" + x1);
			System.out.println("x2��ֵΪ:" + x2);
		} else {
			System.out.println("��������ʵ����");
		}

	}

}
