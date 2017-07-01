package zj;

public class Test6 {

	/**计算1900年到2000年之间共有多少个闰年，并打印这些闰年
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1900;i<=2000;i++){
			if(i%400==0||(i%4==0&&i%100!=0)){count++;
				System.out.println(i);
			}
		}System.out.println("一共"+count+"个闰年");
	}

}
