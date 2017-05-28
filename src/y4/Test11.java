package y4;

public class Test11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=1;
		double b=2;
		double c;
		double sum=0;
		for(int i=1;i<=20;i++){sum=sum+a/b;
		c=a+b;
		a=b;
		b=c;
		}
		System.out.println(sum);
	}

}
