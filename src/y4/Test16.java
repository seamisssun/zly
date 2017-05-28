package y4;

import java.util.*;

public class Test16 {

	/**从键盘输入一个正整数，将该数前后倒置后输出
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int a = sc.nextInt();
		int b=0;
		int c = 0;
		/*while (a / 10 != 0) {
			b = a % 10;
			a=a/10;c = c*10+ b;
			}
		c=c*10+a;
		System.out.println(c);*/
		while (a!= 0) {
			b = a % 10;
			a=a/10;c = c*10+ b;
			}
		System.out.println(c);

	}

}
