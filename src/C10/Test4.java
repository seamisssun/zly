package C10;

public class Test4 {

	/**用循环求10的阶乘(1*2*3…*10)，打印输出结果
		考察知识点：变量的声明和使用；for循环
		利用for循环打印等腰三角形，并注释说明(要求注释清晰)

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int svn=1;
		for(int i=1;i<11;i++){svn*=i;
			
		}
		System.out.println(svn);
		for(int i=1;i<5;i++){
			for(int j=5-i;j>=1;j--){System.out.print(" ");
				
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}System.out.println();
		}
	}

}
