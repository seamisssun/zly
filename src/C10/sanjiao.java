package C10;

public class sanjiao {

	/**	        *****   *			 *       *****     *****
				*****	**		    **       ****       ****
				*****	***		   ***       ***         ***
				*****	****	  ****       **           **
				*****	*****	 *****       *             *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}System.out.println();
		}*/
		/*for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}System.out.println();
		}*/
		/*for(int i=1;i<=5;i++){
			for(int j=5-i;j>1;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}*/
		/*for(int i=0;i<=5;i++){
			for(int j=5-i;j>=1;j--){
				System.out.print("*");
			}System.out.println();
		}*/
		/*for(int i=0;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");	
			}
			for(int k=5-i;k>=1;k--){
				System.out.print("*");	
			}System.out.println();
		}*/
		for(int i=1;i<=5;i++){
			for(int j=5-i;j>0;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");	
			}System.out.println();
		}
	}

}
