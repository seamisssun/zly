package Y5;

public class Test5 {

	/**输出1-100之间所有数，跳过3的倍数和带3的数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<101;i++){
		if(i%3!=0&&(i%10!=3||i/10!=3)){System.out.print(i+" ");}}
	
	}

}
