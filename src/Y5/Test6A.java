package Y5;

public class Test6A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		double a = 1;
		for (double i = 1; i <= 101; i += 2) {
			sum = sum +a * (1 / i);
			a = 0 - a;
		}
		System.out.println(sum);

	}

}
