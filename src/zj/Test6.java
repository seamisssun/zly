package zj;

public class Test6 {

	/**����1900�굽2000��֮�乲�ж��ٸ����꣬����ӡ��Щ����
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1900;i<=2000;i++){
			if(i%400==0||(i%4==0&&i%100!=0)){count++;
				System.out.println(i);
			}
		}System.out.println("һ��"+count+"������");
	}

}
