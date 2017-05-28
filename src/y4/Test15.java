package y4;
import java.util.*;
public class Test15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("«Î ‰»În");
		int n=sc.nextInt();
		System.out.println("«Î ‰»Îa");
		int a=sc.nextInt();
		long t=a;
		long sum=0;
		for(int i=1;i<=n;i++){sum+=t;t=t*10+a;}
		System.out.println(sum);
	}

}
