package C3;

public class Test4 {

	/**将一个数组中的元素前后倒置输出
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{8,9,5,7,4};
		int temp=0;
		//for(int i=arr.length-1;i>=0;i--){System.out.println(arr[i]);}
		int len=arr.length/2;
		for(int i=1;i<len;i++){temp=arr[i];arr[i]=arr[arr.length-i-1];arr[arr.length-i-1]=temp;}
		
	}

}
