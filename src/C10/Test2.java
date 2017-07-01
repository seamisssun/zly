package C10;

public class Test2 {

	/**给定一个字符串数组，按照字典顺序进行从小到大的排序（排序算法自己写）
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
