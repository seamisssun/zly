package C10;

public class Test1 {

	/**输入自己的身份证号码，并由此号码输出自己的生日，年月日

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id="310115201608051020";
		
	System.out.println(id.substring(6,10)+"年"+id.substring(10,12)+"月"+id.substring(12,14)+"日");
	}

}
