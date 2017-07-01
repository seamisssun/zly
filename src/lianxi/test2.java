package lianxi;

public class test2 {

	/**编写求k!的函数，再调用该函数求1!+3!+5!+...+9!之和并输出。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(9));
	}
	public static long sum(int k){
		long svn=1;
		long sum=0;
		for(int i=1;i<=k;i+=2){
			for(int j=1;j<=i;j++){svn*=j;}
			sum+=svn;
		}
		return sum;
	}

}
