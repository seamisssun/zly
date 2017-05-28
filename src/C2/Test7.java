package C2;

public class Test7 {

	/**

	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=1;x<=5;x++){
			for(int y=1;y<=5;y++){
				if(x+y>=4&y-x<=2&x-y<=2&x+y<=8){
					System.out.print("*");
					
				}else{
					System.out.print(" ");

				}
				
			}
			System.out.println("");

		}
	}

}
