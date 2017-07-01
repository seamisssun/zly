package TESTeasy;

public class test2 {
	/** 题二：利用for循环打印如下图形，并注释说明(要求注释清晰)
 *     *
 *    **
 *   ***
 *  ****
 * *****
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			for(int j=0;j<j-i-1;j++){
				System.out.print(" ");}
				for(int k=0;k<=i;k++){
					System.out.print("*");
				}
				System.out.println();
			
		}
		
	}

}
