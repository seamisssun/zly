package y4;

import java.util.*;

public class Test16 {

	/**�Ӽ�������һ����������������ǰ���ú����
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("������һ��������");
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
