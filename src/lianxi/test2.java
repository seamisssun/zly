package lianxi;

public class test2 {

	/**��д��k!�ĺ������ٵ��øú�����1!+3!+5!+...+9!֮�Ͳ������
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
