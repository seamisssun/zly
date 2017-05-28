package C1;

public class job2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		do {
			if (i % 5 == 0 && i % 9 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i < 101);

	}

}
