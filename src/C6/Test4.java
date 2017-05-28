package C6;

public class Test4 {

	/**编写求k!的函数，再调用该函数1！+3！+5！……+9！的和
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
