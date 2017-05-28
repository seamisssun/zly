package y4;

public class Test13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1;
		double sum = 0;
		for (int i = 1; i <= 21; i += 4) {
			if (i == 1) {
				a = 1;
			} else {
				a = a * i * (i - 1) * (i - 2) * (i - 3);
			}
			//System.out.println(a);
			sum += a;

		}
		System.out.println(sum);
	}

}
