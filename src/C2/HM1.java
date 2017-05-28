package C2;

public class HM1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			for (int k = 5-i; k >= 1; k--) {
				System.out.print(" ");
			}
			for (int j =1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=1;a<=5;a++){
			for(int b=1;b<=a;b++){System.out.print(" ");}
			for(int c=1;c<=-2*a+9;c++){System.out.print("*");}
			System.out.println();
		}
	}

}
