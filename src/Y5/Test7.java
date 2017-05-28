package Y5;

public class Test7 {

	/**Çó12+32+52+...+992Ö®ºÍ
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=2;
		int sum=1;
		for(int a=1;a<100;a+=2){sum+=Math.pow(a,b);}
		System.out.println(sum);
	}
}
