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
		System.out.println("请猜测公主电动车的价格（2000-10000之间）：");
		int b;
		int i = 1;
		while (i <= 5) {
			b = sc.nextInt();
			if (b == price) {
				System.out.println("恭喜你，获得了此奖品!");
				return;

			} else if (i == 5) {
				System.out.println("你没有获得奖品!");

			} else if (b < price) {
				System.out.println("再大点!");
			} else if (b > price) {
				System.out.println("再小点!");
			}

			i++;

		}

	}
}
