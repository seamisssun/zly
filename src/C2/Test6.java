package C2;

public class Test6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=0,sum;
		for(int i=0;i<20;i++){
			sum=a+b;
			b=a;
			a=sum;
			System.out.print(b+" ");}
	}
}
