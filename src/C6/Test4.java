package C6;

public class Test4 {

	/**��д��k!�ĺ������ٵ��øú���1��+3��+5������+9���ĺ�
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=9;i+=2){	sum+=fun(i);}
		System.out.println(sum);
		}
	public static int fun(int k){
			int svn=1;
		for(int i=1;i<=k;i++){
							svn*=i;}
			return svn;
	}
}
