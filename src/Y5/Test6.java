package Y5;

public class Test6 {

	/**
	 * �����Ԫ1000�굽����2000��֮�� ��������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;//����
		for (int year = 1000; year < 2001; year++) {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				System.out.println(year);
				count++;
			}
		}

	}

}
