package Y5;

public class Test9 {

	/**��1+1/3+1/5+...��ǰ20��֮��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		double i=1;
		for(int a=1;a<=20;a++){
			sum+=1/i;
		i+=2;	
		}
		System.out.println(sum);

		}

	}