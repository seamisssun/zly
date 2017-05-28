package C2;

public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			System.out.println(" ");
			for (int j = 0; j <= 5 - i; j--) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}