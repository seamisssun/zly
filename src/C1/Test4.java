package C1;

public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		for(int i=100;i<1000;i++){a=i/100;b=i%100/10;c=i%10;if(a*a*a+b*b*b+c*c*c==i){System.out.println(i);}}
	}

}

