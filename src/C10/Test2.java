package C10;

public class Test2 {

	/**����һ���ַ������飬�����ֵ�˳����д�С��������������㷨�Լ�д��
{ "asda", "ret", "vsa", "asdf", "vdft", "qwr" }

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []str={ "asda", "ret", "vsa", "asdf", "vdft", "qwr" };
		for(int i=0;i<str.length-1;i++){
			for(int j=i+1;j<str.length;j++){
				if(str[i].compareTo(str[j])>0){
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
			}for(String a:str){
				System.out.println(a);
			
		}
	}

}
